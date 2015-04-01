package com.pakjivega.prototypehumanresource.bo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;
import com.pakjivega.prototypehumanresource.bo.bean.Agency;

public abstract class BasicDaoImpl<T>   {
	static SessionFactory sessionFactory = HibernateDB.getSessionFactory();
	
	public T get(Class<T> typeBean, int id) {
		Session session = sessionFactory.getCurrentSession();
		T bean = (T) session.get(typeBean, id);
		return bean;
	}

}
