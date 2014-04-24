package com.tn.myssh.service.impl;

import com.tn.myssh.dao.UserDao;
import com.tn.myssh.pojo.User;
import com.tn.myssh.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User checkUser(String username,String password) {
		
		User user = userDao.getUserByNameAndPwd(username, password);
		return user;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
		
	}

	
}
