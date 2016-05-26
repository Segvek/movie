/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.operation;

import com.segvek.inmovie.dao.DaoImpl;
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

/**
 *
 * @author Владимир
 */
public class NewsAdd {

    private HttpServletRequest request;
    private HttpServletResponse response;

    private DaoImpl dao = new DaoImpl(News.class);

    public boolean add() {

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String patchImage = request.getParameter("patchImage");

        News news = new News();

        news.setTitle(title);
        news.setContent(content);
        news.setPatchImage(patchImage);

        try {
            dao.addEntity(news);
            dao.closeSession();
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
