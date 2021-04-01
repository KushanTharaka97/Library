package com.kushan.dea.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// table Reference
@Entity
@Table(name="reference")
public class Reference {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Ref_id")
    private long Ref_id;
    
    @Column(name="Ref_Tittle")
    private String Ref_Tittle;

    @Column(name="Ref_ISBN")
    private int Ref_ISBN;

    @Column(name="Publisher")
    private String Publisher;

    @Column(name="Author")
    private String Author;

    @Column(name="Ref_category")
    private int Ref_Category;

    @Column(name="Ravailable",columnDefinition="tinyint(1) default 1")
    private boolean Refenencing_availability;

    public Reference(String ref_Tittle, int ref_ISBN, String publisher, String author, int ref_Category,
    boolean refenencing_availability) {
            Ref_Tittle = ref_Tittle;
            Ref_ISBN = ref_ISBN;
            Publisher = publisher;
            Author = author;
            Ref_Category = ref_Category;
            Refenencing_availability = refenencing_availability;
            }


    protected Reference(){

    }

    public String getRef_Tittle() {
        return Ref_Tittle;
    }
    public void setRef_Tittle(String ref_Tittle) {
        Ref_Tittle = ref_Tittle;
    }
    public int getRef_ISBN() {
        return Ref_ISBN;
    }
    public void setRef_ISBN(int ref_ISBN) {
        Ref_ISBN = ref_ISBN;
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
    public int getRef_Category() {
        return Ref_Category;
    }
    public void setRef_Category(int category) {
        Ref_Category = category;
    }

    public boolean isRefenencing_availability() {
        return Refenencing_availability;
    }

    public void setRefenencing_availability(boolean refenencing_availability) {
        Refenencing_availability = refenencing_availability;
    }

   



}
