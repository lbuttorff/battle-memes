package com.ist411.memes.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Challenge")
public class Challenge {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private User challenger;
    private User challengee;
    private List<Integer> votes;
}
