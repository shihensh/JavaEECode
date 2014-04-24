package com.tn.myssh.dao.impl;


import org.hibernate.Query;
import org.hibernate.Session;

import com.tn.myssh.dao.UserDao;
import com.tn.myssh.pojo.User;


public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	public User getUserByNameAndPwd(String username,String password){
		
		String hql="from User where username=:usn and password=:pwd";
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		query.setParameter("usn", username);
		query.setParameter("pwd", password);
		return (User)query.uniqueResult();
		
	}
	
	public void add(User user){
		
	}
}
