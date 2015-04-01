package com.pakjivega.prototypehumanresource.bo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;
import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

public abstract class BasicDaoImpl<T> implements BasicDao<T> {
	static SessionFactory sessionFactory = HibernateDB.getSessionFactory();
	
	public T get(Class<T> typeBean, int id) {
		Session session = sessionFactory.getCurrentSession();
		T bean = (T) session.get(typeBean, id);
		return bean;
	}
	public List<T> getAll(Class<T> typeBean) {
		Session session = sessionFactory.openSession();
		List<T> beans = session.createCriteria(typeBean).list();
		session.close();
		return beans;
	}
	public void save(T bean) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(bean);
		session.getTransaction().commit();
		session.close();
	}

}
