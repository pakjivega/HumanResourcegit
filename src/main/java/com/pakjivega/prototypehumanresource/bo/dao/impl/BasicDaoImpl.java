package com.pakjivega.prototypehumanresource.bo.dao.impl;

import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;

public abstract class BasicDaoImpl   {
	static SessionFactory sessionFactory = HibernateDB.getSessionFactory();

}
