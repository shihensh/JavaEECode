package com.tn.myssh.dao;

import java.util.List;

public interface BaseDao<T> {

	void add(T t);
	List<T> listAll(Class T);
}
