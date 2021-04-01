package com.kushan.dea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lending {
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Lending_id")
    private long Lending_id;
    
    @Column(name="Lending_Tittle")
    private String Lending_Tittle;

    @Column(name="Lending_ISBN")
    private int Lending_ISBN;

    @Column(name="Publisher")
    private String Publisher;

    @Column(name="Author")
    private String Author;

    @Column(name="Lending_category")
    private int Lending_Category;

    @Column(name="Lavailable",columnDefinition="tinyint(1) default 1")
    private boolean Lending_availability;

    protected Lending(){

    }

  

    public Lending(String lending_Tittle, int lending_ISBN, String publisher, String author, int lending_Category,
            boolean lending_availability) {
        Lending_Tittle = lending_Tittle;
        Lending_ISBN = lending_ISBN;
        Publisher = publisher;
        Author = author;
        Lending_Category = lending_Category;
        Lending_availability = lending_availability;
    }

    public String getLending_Tittle() {
        return Lending_Tittle;
    }

    public void setLending_Tittle(String lending_Tittle) {
        Lending_Tittle = lending_Tittle;
    }

    public int getLending_ISBN() {
        return Lending_ISBN;
    }

    public void setLending_ISBN(int lending_ISBN) {
        Lending_ISBN = lending_ISBN;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getLending_Category() {
        return Lending_Category;
    }

    public void setLending_Category(int lending_Category) {
        Lending_Category = lending_Category;
    }

    public boolean isLending_availability() {
        return Lending_availability;
    }

    public void setLending_availability(boolean lending_availability) {
        Lending_availability = lending_availability;
    }


    
    
}
