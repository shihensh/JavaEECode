package com.tn.myssh.service.impl;

import java.util.List;

import com.tn.myssh.dao.MenuDao;
import com.tn.myssh.pojo.Menu;
import com.tn.myssh.service.MenuService;

public class MenuServiceImpl<Menu> implements MenuService{

	
	private MenuDao<Menu> menuDao;
	
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<com.tn.myssh.pojo.Menu> listMenu() {
		// TODO Auto-generated method stub
		return (List<Menu>) menuDao.listAll();
	}

	
}
