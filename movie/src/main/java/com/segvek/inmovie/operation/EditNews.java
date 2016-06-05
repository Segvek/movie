/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.operation;

import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.Janr;
import com.segvek.inmovie.entity.News;
import com.segvek.inmovie.entity.User;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Владимир
 */
public class EditNews {

    private HttpServletRequest request;
    private HttpServletResponse response;

    private Dao dao = DaoFactory.getFactory().getDaoNews();

    public boolean edit(Long idnews) {

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String patchImage = request.getParameter("patchImage");

        //загрузка фильма
        DaoImpl daoNews = DaoFactory.getFactory().getDaoNews();
        News news = null;
        try {
            news = (News) daoNews.getEntity(idnews);
        } catch (SQLException ex) {
            Logger.getLogger(EditNews.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        news.setTitle(title);
        news.setContent(content);
        news.setPatchImage(patchImage);

        try {
            dao.updateEntity(news);
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
