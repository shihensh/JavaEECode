package cn.ty.dao.impl;


import org.hibernate.Query;

import cn.ty.dao.UserDao;
import cn.ty.domain.User;

public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	@Override
	public User getUserByParam(String username, String password) {
		// TODO Auto-generated method stub
		
		String hql = "from User where username= :user and password= :pwd ";
		Query query = this.getSession().createQuery(hql);
		query.setString("user", username);
		query.setString("pwd", password);
		return (User) query.uniqueResult();
	}


}
