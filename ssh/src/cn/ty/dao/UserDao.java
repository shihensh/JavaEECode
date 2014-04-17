package cn.ty.dao;

import cn.ty.domain.User;

public interface UserDao extends BaseDao {

	User getUserByParam(String username,String password);
}
