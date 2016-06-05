package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.operation.EditFilms;
import com.segvek.inmovie.operation.FilmAdd;
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

/**
 *
 * @author Panas
 */
public class ListFilms extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF//admin//films.jsp");

        if (!Static.isAdmin(request, response)) {
            dispatcher = request.getRequestDispatcher("errorpage//accessError.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String operation = request.getParameter("operation");
        if (operation == null || operation.equals("")) {
            operation = "unknow";
        }

        List<Film> films = null;
        switch (operation) {
//            case "search":
//                String search = request.getParameter("searchUser");
////                users = getSearchUsers(search);
//                break;
            case "dell":
                String delId = request.getParameter("id");
                Long id = Long.parseLong(delId);
                Dao dao = DaoFactory.getFactory().getDaoFilm();
                try {
                    Film film = (Film) dao.getEntity(id);
                    dao.deleteEntity(film);
                } catch (SQLException ex) {
                    Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
                }
                films = getAllFilms();
                break;
            case "add":
                FilmAdd addFilm = new FilmAdd();
                addFilm.setRequest(request);
                addFilm.setResponse(response);
                if (addFilm.add()) {
                    films = getAllFilms();
                } else {
                    dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                break;
            case "edit":
                EditFilms editFilms = new EditFilms();
                editFilms.setRequest(request);
                editFilms.setResponse(response);
                Long idfilm = Long.parseLong(request.getParameter("id"));
                if(editFilms.edit(idfilm)){
                    films = getAllFilms();
                }else {
                    dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                break;
            default:
                films = getAllFilms();
        }

        request.setAttribute("films", films);
        dispatcher.forward(request, response);
        
    }

    public List<Film> getAllFilms() {
        List<Film> films = null;
        try {
            DaoImpl<Film> dao = DaoFactory.getFactory().getDaoFilm();
            films = dao.getListEntity();
            dao.closeSession();
        } catch (SQLException ex) {
            Logger.getLogger(ListFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
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
