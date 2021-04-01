package com.kushan.dea.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Publishers {

    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int Publisher_id;

    private String Publisher_Name;

    @OneToMany(targetEntity = Lending.class)
    private List bookList;

    public String getPublisher_Name() {
        return Publisher_Name;
    }

    public void setPublisher_Name(String publisher_Name) {
        Publisher_Name = publisher_Name;
    }

    public List getBookList() {
        return bookList;
    }

    public void setBookList(List bookList) {
        this.bookList = bookList;
    }

    

    
}
