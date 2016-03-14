package com.example.dell.tdintent;

import java.io.Serializable;

/**
 * Created by Dell on 29/02/2016.
 */
public class Book implements Serializable {


    private  String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
