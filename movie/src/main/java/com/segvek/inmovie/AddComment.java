/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie;

import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
import com.segvek.inmovie.entity.Comment;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
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
import org.hibernate.Session;

/**
 *
 * @author Panas
 */
public class AddComment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher;
        
        Long id=0L;
        Film film=null;
        try {
            id = Long.parseLong(request.getParameter("idFilm"));
            film = (Film) DaoFactory.getFactory().getDaoFilm().getEntity(id);
            if(film==null)
                dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ViewFilm.class.getName()).log(Level.SEVERE, null, ex);
            dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
        }
        
        Comment comment =  new Comment();
        User user = (User) request.getSession().getAttribute("user");
        comment.setUser(user);
        user.getComments().add(comment);
        comment.setFilm(film);
        film.getComents().add(comment);
        comment.setComment(request.getParameter("text_comment"));
        
        try {
            new DaoImpl<>(Comment.class).addEntity(comment);
        } catch (SQLException ex) {
            Logger.getLogger(AddComment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            DaoFactory.getFactory().getDaoFilm().updateEntity(film);
//            DaoFactory.getFactory().getDaoUser().updateEntity(user);
        } catch (SQLException ex) {
            Logger.getLogger(AddComment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        dispatcher = request.getRequestDispatcher("page?operation=film&id="+film.getId());
        dispatcher.forward(request, response);
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
