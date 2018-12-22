package com.freakyshoe.service;

import java.util.List;

import com.freakyshoe.bean.UserBean;
import com.freakyshoe.dao.UserDao;

public class LoginService 
{
	
	private UserDao dao;

	public void setDao(UserDao dao)
	{
		this.dao = dao;
	}

	
	public String isValid(String userName, String password) {
		List<UserBean> Users = dao.getAll();
		for (UserBean userBean : Users) {
			if (userBean.getUserName().equals(userName) && userBean.getPassword().equals(password)) {
				return "Success";
			}
		}

		return "invalid user!!";

	}

	public void addUser(String userName, String password, long userId) {
		dao.add(userName, password, userId);
	}

}
