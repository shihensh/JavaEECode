package com.tn.myssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tn.myssh.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao {

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

	@Override
	public void add(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List listAll(Class T) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
