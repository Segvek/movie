/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.segvek.inmovie.dao.DaoFactory;
import com.segvek.inmovie.dao.DaoImpl;
import com.segvek.inmovie.db.HibernateUtil;
import com.segvek.inmovie.entity.News;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Владимир
 */
public class TestSelectNews {

    @Test
    public void selectOneNews() throws SQLException {
        News news = (News) DaoFactory.getFactory().getDaoNews().getEntity(1L);
        System.out.println(news.getTitle());
        assertFalse(news == null);
    }

    @Test
    public void selectListNews() throws SQLException {
        List<News> news = DaoFactory.getFactory().getDaoNews().getListEntity();
        System.out.println(news.size());
        assertTrue(news.size() == 0);
    }
}
