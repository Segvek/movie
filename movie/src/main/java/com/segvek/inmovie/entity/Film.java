package com.segvek.inmovie.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film extends Model {

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private String year;

    @Column(name = "county")
    private String county;

    @Column(name = "regeser")
    private String regeser;

    @Column(name = "schenarist")
    private String schenarist;

    @Column(name = "produser")
    private String produser;

    @Column(name = "kompositor")
    private String kompositor;

    @Column(name = "budget")
    private String budget;

    @Column(name = "sbory")
    private String sbory;

    @Column(name = "premera")
    private String premera;

    @Column(name = "time")
    private String time;

    @Column(name = "patchImage")
    private String patchImage;

    @Column(name = "atRore")
    private String atRore;

    @Column(name = "anotation", length = Integer.MAX_VALUE)
    private String anotation;

    @Column(name = "linkVideo")
    private String linkVideo;

    
    @ManyToMany
    @JoinTable(name = "janr_film", joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "janr_id")})
    private Set<Janr> janrs = new HashSet<>();

    
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "film")
    private Set<Comment> coments = new HashSet<>();

    @ManyToMany(mappedBy = "films", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

    public Film() {
    }

    public Film(Long id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getRegeser() {
        return regeser;
    }

    public void setRegeser(String regeser) {
        this.regeser = regeser;
    }

    public String getSchenarist() {
        return schenarist;
    }

    public void setSchenarist(String schenarist) {
        this.schenarist = schenarist;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getKompositor() {
        return kompositor;
    }

    public void setKompositor(String kompositor) {
        this.kompositor = kompositor;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getSbory() {
        return sbory;
    }

    public void setSbory(String sbory) {
        this.sbory = sbory;
    }

    public String getPremera() {
        return premera;
    }

    public void setPremera(String premera) {
        this.premera = premera;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatchImage() {
        return patchImage;
    }

    public void setPatchImage(String patchImage) {
        this.patchImage = patchImage;
    }

    public String getAtRore() {
        return atRore;
    }

    public void setAtRore(String atRore) {
        this.atRore = atRore;
    }

    public String getAnotation() {
        return anotation;
    }

    public void setAnotation(String anotation) {
        this.anotation = anotation;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public Set<Janr> getJanrs() {
        return janrs;
    }

    public void setJanrs(Set<Janr> janrs) {
        this.janrs = janrs;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    
}
