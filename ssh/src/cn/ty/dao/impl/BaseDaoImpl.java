package cn.ty.dao.impl;

import java.util.List;
import java.util.Map;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.ty.dao.BaseDao;

public class BaseDaoImpl implements BaseDao {

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
	public void add(Object obj) {
		// TODO Auto-generated method stub
		this.getSession().save(obj);
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		this.getSession().delete(obj);
	}

	@Override
	public void delete(int id,Class clazz) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		this.getSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> get() {
		// TODO Auto-generated method stub
		return (List<Object>) this.getSession().load(Object.class, null);
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
