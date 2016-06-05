package com.segvek.inmovie.dao;

import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.Janr;
import com.segvek.inmovie.entity.News;
import com.segvek.inmovie.entity.User;

/**
 *
 * @author Panas
 */
public class DaoFactory {
    private static DaoFactory daofactory = new DaoFactory();
    public static DaoFactory getFactory(){
        return daofactory;
    }
    
    private DaoImpl daoUser = new DaoImpl<>(User.class);
    private DaoImpl daoFilm = new DaoImpl<>(Film.class);
    private DaoImpl daoJanr = new DaoImpl<>(Janr.class);
    private DaoImpl daoNews = new DaoImpl<>(News.class);

    private DaoFactory() {
    }

    public DaoImpl getDaoUser() {
        return daoUser;
    }

    public DaoImpl getDaoFilm() {
        return daoFilm;
    }

    public DaoImpl getDaoJanr() {
        return daoJanr;
    }

    public DaoImpl getDaoNews() {
        return daoNews;
    }
    
}
