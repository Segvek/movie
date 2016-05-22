package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Janr;
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
public class AddFilm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF//admin//add_film.jsp");

        if (!Static.isAdmin(request, response)) {
            dispatcher = request.getRequestDispatcher("errorpage//accessError.jsp");
            dispatcher.forward(request, response);
            return;
        }

        List<Janr> janrs = getAllJanrs();
        request.setAttribute("janrs",janrs);
        dispatcher.forward(request, response);
    }

    public List<Janr> getAllJanrs(){
        List<Janr> ranrs=null;
        try {
            ranrs = new DaoImpl<>(Janr.class).getListEntity();
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
