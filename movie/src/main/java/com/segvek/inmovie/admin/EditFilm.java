package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.Janr;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditFilm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF//admin//edit_film.jsp");

        if (!Static.isAdmin(request, response)) {
            dispatcher = request.getRequestDispatcher("errorpage//accessError.jsp");
            dispatcher.forward(request, response);
            return;
        }
        String idString = request.getParameter("id");

        String operation = request.getParameter("operation");
        if (idString == null || idString.equals("")) {
            dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
            dispatcher.forward(request, response);
            return;
        }
        
        
        Long id = 0L;
        Film film=null;
        DaoImpl<Film> dao = DaoFactory.getFactory().getDaoFilm();
        try {
            id = Long.parseLong(idString);
            film = dao.getEntity(id);
        } catch (SQLException ex) {
            Logger.getLogger(EditFilm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        List<Janr> janrs = getAllJanrs();
//        List<Janr> janrs=new ArrayList<>();
        request.setAttribute("janrs",janrs);
        request.setAttribute("film", film);
        dispatcher.forward(request, response);
        dao.closeSession();
    }

    public List<Janr> getAllJanrs(){
        List<Janr> ranrs=null;
        try {
            ranrs = DaoFactory.getFactory().getDaoJanr().getListEntity();
        } catch (SQLException ex) {
            Logger.getLogger(EditFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ranrs;
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

}
