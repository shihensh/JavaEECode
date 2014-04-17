package cn.ty.service.impl;

import cn.ty.dao.UserDao;
import cn.ty.domain.User;
import cn.ty.service.UserService;

public class UserServiceImpl implements UserService {


	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User checkUser(String username, String password) {
		// TODO Auto-generated method stub
		
		return userDao.getUserByParam(username, password);
	}

	@Override
	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
