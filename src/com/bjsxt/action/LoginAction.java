package com.bjsxt.action;

import com.bjsxt.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String name;
	private String pwd;
	private User user;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String login(){
		System.out.println("name:"+" "+name);
		System.out.println("pwd:"+" "+pwd);
		return SUCCESS;
	}
	
	public String login2(){
		System.out.println("账号："+user.getName());
		System.out.println("地址："+user.getAddr().getName());
		return "login2";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
