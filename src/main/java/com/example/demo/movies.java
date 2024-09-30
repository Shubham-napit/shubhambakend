package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movies {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long  id;
    private String name;
    private String genre;
    private Boolean  ispopular;
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Boolean getIspopular() {
        return ispopular;
    }
    public void setIspopular(Boolean ispopular) {
        this.ispopular = ispopular;
    }

    public movies(Long id, String name, String genre, Boolean ispopular) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.ispopular = ispopular;  
    }

    public movies() {
    }


}
 