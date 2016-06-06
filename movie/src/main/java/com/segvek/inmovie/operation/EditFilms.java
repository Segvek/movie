package com.segvek.inmovie.operation;

import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
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
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Panas
 */
public class EditFilms {

    private HttpServletRequest request;
    private HttpServletResponse response;

    private Dao dao = DaoFactory.getFactory().getDaoUser();

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
        Long idKinipoisk = Long.parseLong(request.getParameter("kinopoisk"));
        
        
        String janrsString[] = request.getParameterValues("janr");

        //загрузка фильма
        DaoImpl daoFilm = DaoFactory.getFactory().getDaoFilm();
        Film film = null;
        try {
            film = (Film) daoFilm.getEntity(idfilm);
        } catch (SQLException ex) {
            Logger.getLogger(EditFilms.class.getName()).log(Level.SEVERE, null, ex);
        }

        //очистка старых связей с жанрами 
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "delete from Janr_Film where film_id= "+film.getId();
        Query query = session.createSQLQuery(sql);
        query.executeUpdate();
        session.close();

        //Создание связей с жанрами
        Set<Janr> janrs = new HashSet<>();
        try {
            DaoImpl<Janr> daoJanr = DaoFactory.getFactory().getDaoJanr();
            for (int i = 0; i < janrsString.length; i++) {
                Long id = Long.parseLong(janrsString[i]);
                Janr janr = daoJanr.getEntity(id);
                janrs.add(janr);
                janr.getFilms().add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
        film.setIdKinipoisk(idKinipoisk);
        
        try {
            daoFilm.updateEntity(film);
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
