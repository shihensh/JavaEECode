package com.tn.myssh.service;

import com.tn.myssh.pojo.User;

public interface UserService {


	User checkUser(String username, String password);

	void add(User user);
}
