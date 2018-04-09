package com.ist411.memes.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;
    @Basic
    private Date date;

    public Post(String text){
        this.text = text;
        this.date = new Date(new java.util.Date().getTime());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
