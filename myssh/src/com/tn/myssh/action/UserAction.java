package com.tn.myssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tn.myssh.pojo.User;
import com.tn.myssh.service.UserService;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6456766562472108276L;
	

	private UserService userService;
	
	private User user;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

	/**
	 * µÇÂ½
	 * @return
	 */
	public String login(){
		user = userService.checkUser(username, password);
		
		if(user!=null){
			
			ActionContext.getContext().getSession().put("user", user);
			return "succeed";
		}else {
			return "error";
		}
		
	}
	
	/**
	 * ×¢²á
	 * @return
	 */
	public String regiester(){
		user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userService.add(user);
		ActionContext.getContext().getSession().put("user", user);
		return "succeed";
	}
	
	
	
}
