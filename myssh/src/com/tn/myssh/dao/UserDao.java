package com.tn.myssh.dao;

import java.util.List;

import com.tn.myssh.pojo.User;

public interface UserDao extends BaseDao {

	User getUserByNameAndPwd(String username,String password);
	List<User> findAllUser();
	
}
