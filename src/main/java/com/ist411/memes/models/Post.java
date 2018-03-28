package com.ist411.memes.models;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;
    private File media;
    private Challenge challenge;
}
