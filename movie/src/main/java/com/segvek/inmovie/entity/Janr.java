
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
import javax.persistence.Table;

@Entity
@Table(name = "janr")
public class Janr extends Model{
    
    @Column(name = "name")
    private String name;
    
    
    @ManyToMany(mappedBy = "janrs", fetch = FetchType.LAZY, 
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Film> films = new HashSet<>();

    public Janr() {
    }

    public Janr(Long id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
    
    
    
}
