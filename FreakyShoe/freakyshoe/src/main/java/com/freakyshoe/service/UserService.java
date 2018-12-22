package com.freakyshoe.service;

import java.util.List;

import com.freakyshoe.bean.UserBean;
import com.freakyshoe.dao.UserDao;

public class UserService
{
	UserDao dao = new UserDao();
	
  public String isValid(String user,String pass)
  {
	   List<UserBean> Users= dao.getAll();
	   for (UserBean userBean : Users) 
	   {
	      if(userBean.getUserName().equals(user)&&userBean.getPassword().equals(pass))
	      {
	    	  return "Success";
	      }
       }
	  
	return "invalid user!!";
	  
  }
  
  public void addUser(String user,String pass,long userId)
  {
	  dao.add(user, pass, userId);
  }

}
