package com.tn.myssh.service.impl;

import java.util.List;

import com.tn.myssh.dao.MenuDao;
import com.tn.myssh.pojo.Menu;
import com.tn.myssh.service.MenuService;

public class MenuServiceImpl<T> implements MenuService{

	
	private MenuDao<T> menuDao;
	
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Menu> listMenu() {
		// TODO Auto-generated method stub
		return (List<Menu>) menuDao.listAll(Menu.class);
	}

	
}
