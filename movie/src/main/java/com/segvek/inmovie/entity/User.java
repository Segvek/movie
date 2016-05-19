/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segvek.inmovie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Model{
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "mail")
    private String mail;
    
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role rol;

    public User() {
    }

    public User(Long id) {
        super(id);
    }

    public User(String login, String pass, String mail, Role rol) {
        this.login = login;
        this.pass = pass;
        this.mail = mail;
        this.rol = rol;
    }

    public User(String login, String pass, String mail, Role rol, Long id) {
        super(id);
        this.login = login;
        this.pass = pass;
        this.mail = mail;
        this.rol = rol;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }
}
