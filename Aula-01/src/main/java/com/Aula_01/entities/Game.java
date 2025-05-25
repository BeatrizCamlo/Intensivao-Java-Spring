package com.Aula_01.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")


public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private int year;
    private String genre;
    private String plataforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    // Contrutores
    public Game(){

    }

    public Game(Long id, String title, int year, String genre, String plataforms, double score, String imgUrl,
            String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.plataforms = plataforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    // Getters

    public String getGenre() {
        return genre;
    }
    public Long getId() {
        return id;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public String getPlataforms() {
        return plataforms;
    } 
    public double getScore() {
        return score;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    
    // Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    public void setPlataforms(String plataforms) {
        this.plataforms = plataforms;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
}
