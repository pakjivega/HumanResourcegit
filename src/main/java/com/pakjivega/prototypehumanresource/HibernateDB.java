package com.pakjivega.prototypehumanresource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDB {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {

		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Unable to create a SesssionFactory ex: " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}