/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.admin;

import com.segvek.inmovie.Static;
import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.operation.EditNews;
import com.segvek.inmovie.operation.NewsAdd;
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

/**
 *
 * @author Владимир
 */
public class ListNews extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF//admin//news.jsp");
        System.out.println("=========================================================");
        if (!Static.isAdmin(request, response)) {
            dispatcher = request.getRequestDispatcher("errorpage//accessError.jsp");
            dispatcher.forward(request, response);
            return;
        }
        String operation = request.getParameter("operation");
        if (operation == null || operation.equals("")) {
            operation = "unknow";
        }

       List<com.segvek.inmovie.entity.News> news = null;
        switch (operation) {
//            case "search":
//                String search = request.getParameter("searchUser");
////                users = getSearchUsers(search);
//                break;
            case "dell":
                String delId = request.getParameter("id");
                Long id = Long.parseLong(delId);
                Dao dao = DaoFactory.getFactory().getDaoNews();
                try {
                    com.segvek.inmovie.entity.News onenews = (com.segvek.inmovie.entity.News) dao.getEntity(id);
                    dao.deleteEntity(onenews);
                } catch (Exception ex) {
//                    Logger.getLogger(ListUsers.class.getName()).log(Level.SEVERE, null, ex);
                }
                news = loadListNews();
                break;
            case "add":
                NewsAdd addNews = new NewsAdd();
                addNews.setRequest(request);
                addNews.setResponse(response);
                if (addNews.add()) {
                    news = loadListNews();
                } else {
                    dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                break;
            case "edit":
                EditNews editNews = new EditNews();
                editNews.setRequest(request);
                editNews.setResponse(response);
                Long idnews = Long.parseLong(request.getParameter("id"));
                if(editNews.edit(idnews)){
                    news = loadListNews();
                }else {
                    dispatcher = request.getRequestDispatcher("errorpage//ErrorNotFoundPage.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                break;
            default:
                news = loadListNews();
        }
        request.setAttribute("news", news);
        dispatcher.forward(request, response);
    }

    private List<com.segvek.inmovie.entity.News> loadListNews() {
        List<com.segvek.inmovie.entity.News> news = null;
        try {
            news = DaoFactory.getFactory().getDaoNews().getListEntity();
        } catch (SQLException ex) {
            Logger.getLogger(ListNews.class.getName()).log(Level.SEVERE, null, ex);
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
