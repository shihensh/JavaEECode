package cn.ty.action;


import com.opensymphony.xwork2.ActionContext;

import cn.ty.domain.User;
import cn.ty.service.UserService;

public class UserAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1113149448594027008L;
	
	private User user;
	private UserService userService;
	
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



	public String login(){
		
		username = this.getUsername();
		password = this.getPassword();
		
		user = userService.checkUser(username, password);
		
		if(user!=null){
			
			ActionContext.getContext().getSession().put("user", user);
			return "login succeed";
		}
		
		return "error";
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}
