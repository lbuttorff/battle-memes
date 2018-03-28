package com.ist411.memes.daos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAO {

    @Autowired
    private SessionFactory sessionFactory;


}
