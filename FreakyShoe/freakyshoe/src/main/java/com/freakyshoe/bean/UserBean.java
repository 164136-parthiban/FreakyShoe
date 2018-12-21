package com.freakyshoe.bean;

public class UserBean 
{
	long userId;
	String userName,password;
	
	public UserBean(long userId, String userName, String password)
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	
	public UserBean() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getUserId() 
	{
		return userId;
	}
	
	public void setUserId(long userId)
	{
		this.userId = userId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
