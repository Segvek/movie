package com.segvek.inmovie.operation;

import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration {

    private HttpServletRequest request;
    private HttpServletResponse response;
    
    private Dao dao = DaoFactory.getFactory().getDaoUser();
    public boolean registration() {
        String login = request.getParameter("login");
        String mail = request.getParameter("email");
        String pass = request.getParameter("pass");
        String passr = request.getParameter("passr");

        if (login == null || mail.equals("") || pass == null || passr==null || !pass.equals(passr)) {
            return false;
        }
        
        User user = new User();
        user.setRol(1);
        user.setMail(mail);
        user.setPass(pass);
        user.setLogin(login);
        try {
            dao.addEntity(user);
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}
