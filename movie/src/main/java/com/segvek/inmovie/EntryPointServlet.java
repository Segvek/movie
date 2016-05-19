package com.segvek.inmovie;

import com.segvek.inmovie.operation.Registration;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Panas
 */
public class EntryPointServlet extends HttpServlet {

    private Registration registrator = new Registration();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if (operation == null) {
            operation = "unknow";
        }

        String address = null;

        switch (operation) {
            case "film": {
                address = "view_film.jsp";
                break;
            }
            case "registration": {
                address = "logreg.jsp";
                break;
            }
            case "registrationUser": {
                registrator.setRequest(request);
                registrator.setResponse(response);
                if (registrator.registration()) {
                    address = "index.jsp";
                } else {
                    address = "logreg.jsp";
                }
                break;
            }
            default:
                address = "index.jsp";
        }

//        try {
//            new DaoImpl<>(Role.class).addEntity(new Role("Администратор"));
//        } catch (SQLException ex) {
//            Logger.getLogger(EntryPointServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
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
