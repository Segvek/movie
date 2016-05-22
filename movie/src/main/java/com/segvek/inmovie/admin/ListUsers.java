package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
import com.segvek.inmovie.entity.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;

public class ListUsers extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF//admin//users.jsp");

        if (!Static.isAdmin(request, response)) {
            dispatcher = request.getRequestDispatcher("errorpage//accessError.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String operation = request.getParameter("operation");
        if (operation == null || operation.equals("")) {
            operation = "unknow";
        }

        List<User> users = null;
        switch (operation) {
            case "search":
                String search = request.getParameter("searchUser");
                users = getSearchUsers(search);
                break;
            case "del":
                String delId = request.getParameter("id");
                Long id = Long.parseLong(delId);
                Dao dao = new DaoImpl<>(User.class);
                try {
                    User user = (User) dao.getEntity(id);
                    dao.deleteEntity(user);
                } catch (SQLException ex) {
                    Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
                }
                users = getAllUsers();
                break;
            default:
                users = getAllUsers();
        }

        request.setAttribute("users", users);
        dispatcher.forward(request, response);
    }

    private List<User> getAllUsers() {
        List<User> users = null;
        try {
            users = new DaoImpl<>(User.class).getListEntity();
        } catch (SQLException ex) {
            Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private List<User> getSearchUsers(String search) {
        List<User> users = null;
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM com.segvek.inmovie.entity.User WHERE "
                + "login like '%" + search + "%'");

        System.out.println(query);
        users = query.list();
        return users;
    }

}
