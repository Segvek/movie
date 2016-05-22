/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.operation;

import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.Janr;
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
 * @author Panas
 */
public class EditFilms {

    private HttpServletRequest request;
    private HttpServletResponse response;

    private Dao dao = new DaoImpl(User.class);

    public boolean edit(Long idfilm) {

        String name = request.getParameter("name");
        String year = request.getParameter("year");
        String county = request.getParameter("county");
        String regeser = request.getParameter("regeser");
        String schenarist = request.getParameter("schenarist");
        String producer = request.getParameter("producer");
        String kompositor = request.getParameter("kompositor");
        String sbory = request.getParameter("sbory");
        String premera = request.getParameter("premera");
        String atRore = request.getParameter("atRore");
        String anotation = request.getParameter("anotation");
        String linkVideo = request.getParameter("linkVideo");
        String patchImage = request.getParameter("patchImage");
        String budget = request.getParameter("budget");
        String time = request.getParameter("time");

        Set<Janr> janrs = new HashSet<>();
        String janrsString[] = request.getParameterValues("janr");

        DaoImpl daoJanr = new DaoImpl(Janr.class);
        for (int i = 0; i < janrsString.length; i++) {
            Long id = Long.parseLong(janrsString[i]);
            Janr janr = null;
            try {
                janr = (Janr) daoJanr.getEntity(id);
            } catch (SQLException ex) {
                Logger.getLogger(FilmAdd.class.getName()).log(Level.SEVERE, null, ex);
            }
            janrs.add(janr);
        }
        daoJanr.closeSession();
        
        Dao daoFilm = new DaoImpl(Film.class);
        Film film=null;
        try {
            film = (Film) daoFilm.getEntity(idfilm);
        } catch (SQLException ex) {
            Logger.getLogger(EditFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        film.setJanrs(janrs);
        film.setName(name);
        film.setAnotation(anotation);
        film.setAtRore(atRore);
        film.setBudget(budget);
        film.setCounty(county);
        film.setKompositor(kompositor);
        film.setLinkVideo(linkVideo);
        film.setYear(year);
        film.setPatchImage(patchImage);
        film.setPremera(premera);
        film.setProduser(producer);
        film.setRegeser(regeser);
        film.setSbory(sbory);
        film.setSchenarist(schenarist);
        film.setTime(time);

        try {
            daoJanr.updateEntity(film);
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
