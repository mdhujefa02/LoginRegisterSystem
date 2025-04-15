package com.example.dao;

import com.example.model.User;
import com.example.util.HibernateUtil;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public void register(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    public User login(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query  query = session.createQuery("from User where username = :username and password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        User user = (User) query.uniqueResult();
        session.close();
        return user;
    }
}
