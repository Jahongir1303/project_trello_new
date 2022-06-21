package com.company.services.auth;

import com.company.configs.HibernateConfigurer;
import com.company.doamins.auth.AuthUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthService {
    protected static SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
    private static Session session = sessionFactory.getCurrentSession();

    public static String checkPasswordAndEmail(String email, String password) {
        return (String) session.createQuery("select hr.user_login(email, password)").getSingleResult();
    }
}
