/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.segvek.inmovie.dao.Dao;
import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
import com.segvek.inmovie.entity.User;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Panas
 */
public class TestSelectUser {
    
    public TestSelectUser() {
    }
    
    @Test
    public void selectOneUser(){
        Dao dao = DaoFactory.getFactory().getDaoUser();
        
        User user=null;
        try {
            user = (User) dao.getEntity(5L);
        } catch (SQLException ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
        
        if(user!=null){
            System.out.println(user);
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        
        
    }
    
    @Test
    public void selectUsersLOginAndPass(){
        String login="admin";
        String pass = "admin";
        
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM com.segvek.inmovie.entity.User WHERE "
                + "login='"+login+"' AND pass='"+pass+"'");
        User users = (User) query.uniqueResult();
        
        System.out.println(users);
        
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
