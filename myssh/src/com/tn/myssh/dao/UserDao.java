package com.tn.myssh.dao;

import com.tn.myssh.pojo.User;

public interface UserDao {

	User getUserByNameAndPwd(String username,String password);
	void add(User user);
}
