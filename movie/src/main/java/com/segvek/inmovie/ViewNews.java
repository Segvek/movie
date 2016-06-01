package com.segvek.inmovie;

import com.segvek.inmovie.admin.ListFilms;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.News;
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


public class ViewNews extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("news.jsp");
        
        Long id=0L;
           
        List<News> news = null;
        try {
            news = new DaoImpl<>(News.class).getListEntity();
            if(news==null)
                dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ViewFilm.class.getName()).log(Level.SEVERE, null, ex);
            dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
        }
        
        request.setAttribute("news", news);
        dispatcher.forward(request, response);        
    }

    public List<News> getAllNews() {
        List<News> news = null;
        try {
            DaoImpl<News> dao = new DaoImpl<>(News.class);
            news = dao.getListEntity();
            dao.closeSession();
        } catch (SQLException ex) {
            Logger.getLogger(ListFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
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
