package cn.ty.service;

import cn.ty.domain.User;

public interface UserService {

	
	User checkUser(String username,String password);
	
	User getUserById();
	
	User getUserByName();
	
	
}
