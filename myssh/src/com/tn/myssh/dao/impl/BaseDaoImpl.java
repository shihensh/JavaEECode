package com.tn.myssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tn.myssh.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T> {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		this.getSession().save(t);
	}

	@Override
	public void saveOrUpdate(T t) {
		// TODO Auto-generated method stub
		this.getSession().saveOrUpdate(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		this.getSession().delete(t);
	}

	
	
}
