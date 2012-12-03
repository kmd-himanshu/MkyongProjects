package com.loiane.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.loiane.com.model.City;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static AnnotationConfiguration configuration;
	
	static {
		try {
			
			configuration = new AnnotationConfiguration().configure();
			sessionFactory = configuration.addPackage("com.loiane.model")
								.addAnnotatedClass(City.class)
								.buildSessionFactory();
			
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static AnnotationConfiguration getConfiguration() {
		return configuration;
	}
	
	public static void setSessionFactory(SessionFactory factory) {
        HibernateUtil.sessionFactory = factory;
    }

}