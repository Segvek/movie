/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.entity.Film;
import com.segvek.inmovie.entity.Janr;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCreateJoinFilmToJanr {
    
    @Test
    public void testAdd(){
        Set<Janr> janrs =new HashSet<>();
        Film film= new Film();
        try{
            DaoImpl<Janr> daoJanr = new DaoImpl<>(Janr.class);
            for(Janr janr:daoJanr.getListEntity()){
                janrs.add(janr);
                janr.getFilms().add(film);
            }
            daoJanr.closeSession();
        }catch(SQLException e){
            e.printStackTrace();
            assertTrue(false);
        }
        
        film.setJanrs(janrs);
        
        try {
            new DaoImpl<>(Film.class).addEntity(film);
        } catch (Exception ex) {
            Logger.getLogger(TestCreateJoinFilmToJanr.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(false);
        }
        
    }
}
