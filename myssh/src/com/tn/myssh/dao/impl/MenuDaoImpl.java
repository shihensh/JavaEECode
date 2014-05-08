package com.tn.myssh.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.tn.myssh.dao.MenuDao;

public class MenuDaoImpl<T> extends BaseDaoImpl<T> implements MenuDao<T> {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		String hql = "from Menu";
		Query query = this.getSession().createQuery(hql);
		return query.list();
	}
	
}
