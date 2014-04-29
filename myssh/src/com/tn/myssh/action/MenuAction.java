package com.tn.myssh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tn.myssh.pojo.Menu;
import com.tn.myssh.service.MenuService;

public class MenuAction extends ActionSupport{

	private MenuService menuService;
	List<Menu> menuList;
	
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public String menuList(){
		menuList = menuService.listMenu();
		
		return "succeed";
	}
}
