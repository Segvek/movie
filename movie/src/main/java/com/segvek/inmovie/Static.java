/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie;

import com.segvek.inmovie.entity.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Panas
 */
public class Static {
    public static boolean isAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        if(session==null){
            return false;
        }
        User user = (User) session.getAttribute("user");
        if (user == null || user.getRol() != 2) {
            return false;
        }
        return true;
    }

    static boolean isUser(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        if(session==null){
            return false;
        }
        User user = (User) session.getAttribute("user");
        if (user != null &&(user.getRol() == 2 || user.getRol()==1) ) {
            return true;
        }
        return false;
    }
}
