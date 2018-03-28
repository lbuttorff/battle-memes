package com.ist411.memes.daos;

import com.ist411.memes.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addUser(User u){
        Session s = this.sessionFactory.getCurrentSession();
        s.persist(u);
    }
    public void updateUser(User u){
        Session s = this.sessionFactory.getCurrentSession();
        s.update(u);
    }
    public List<User> listUsers(){
        Session s = this.sessionFactory.getCurrentSession();
        List<User> users = s.createQuery("from User").list();
        return users;
    }
    public User getUserById(long id){
        Session s = this.sessionFactory.getCurrentSession();
        User u = s.load(User.class, new Long(id));
        return u;
    }
    public void removeUser(long id){
        Session s = this.sessionFactory.getCurrentSession();
        User u = s.load(User.class, new Long(id));
        if(u != null){
            s.delete(u);
        }
    }
}
