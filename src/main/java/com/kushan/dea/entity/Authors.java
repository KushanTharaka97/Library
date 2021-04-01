package com.kushan.dea.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Authors {

    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int Author_id;

    private String Author_name;

    @OneToMany(targetEntity = Lending.class)
    private List bookList;


    public String getAuthor_name() {
        return Author_name;
    }


    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }


    public List getBookList() {
        return bookList;
    }


    public void setBookList(List bookList) {
        this.bookList = bookList;
    }

    
}
