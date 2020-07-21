package com.techno.utill;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtill {

	    
	 private static SessionFactory sessionFactory = null;
	 
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	        	sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	           
	        }
	 
	        return sessionFactory;
	    }
	
}
