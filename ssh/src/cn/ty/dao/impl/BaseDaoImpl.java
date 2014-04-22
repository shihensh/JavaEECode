package cn.ty.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.ty.dao.BaseDao;

public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		this.getSession().save(obj);
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id,Class clazz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> get() {
		// TODO Auto-generated method stub
		return (List<Object>) this.getHibernateTemplate().load(Object.class, null);
	}

	@Override
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getByParam(Map<String, String> param) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	

}
