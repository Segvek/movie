/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Admin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF//admin//index.jsp"); 
        if (!Static.isAdmin(request, response)) {
            dispatcher=request.getRequestDispatcher("errorpage//accessError.jsp"); 
            dispatcher.forward(request, response);
            return;
        }
        
        

        String page = request.getParameter("page");
        if(page==null){
            dispatcher.forward(request, response);
            return;
        }
        switch(page){
            case "users":
                dispatcher=request.getRequestDispatcher("ListUsers"); 
                break;
            case "addFilm":
                dispatcher=request.getRequestDispatcher("WEB-INF//admin//add_film.jsp"); 
                break;
            default:
                dispatcher=request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp"); 
        }  
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
