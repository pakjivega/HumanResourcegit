package com.pakjivega.prototypehumanresource.bo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;
import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

public abstract class BasicDaoImpl<T> implements BasicDao<T> {
	protected static EntityManagerFactory factoriaSession = Persistence.createEntityManagerFactory("HumanResourcePersistance");
	protected static EntityManager manager = factoriaSession.createEntityManager();
	
	public T get(Class<T> typeBean, int id) {
		TypedQuery<T> query = manager.createQuery("SELECT l FROM " + typeBean + " l where l.id=?1", typeBean);
		query.setParameter(1, id);
		T bean = null;
		bean = query.getSingleResult();
		return bean;
	}
	public List<T> getAll(Class<T> typeBean) {
		TypedQuery<T> query = manager. createQuery("SELECT l FROM " + typeBean.getSimpleName() + "  l ", typeBean);
		List<T> listBeans = null;
		listBeans = query.getResultList();
		return listBeans;
		
	}
	public void save(T bean) {
		EntityTransaction tx = null;
		tx = manager.getTransaction();
		tx.begin();
		manager.persist(bean); 
		tx.commit();
	}

}
