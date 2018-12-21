package com.freakyshoe;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.freakyshoe.bean.UserBean;
import com.freakyshoe.dao.UserDao;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		UserDao userDao = context.getBean(UserDao.class);
		
		/*System.out.println("------Records Creation--------");
		userDao.add("parthi","Parthi", 1L );
		userDao.add("madhuri", "parthi123", 2L);*/

		System.out.println("\n------Listing Multiple Records--------");

		List<UserBean> users = userDao.getAll();

		for (UserBean record : users) {
			System.out.print("ID : " + record.getUserId());
			System.out.print(", Name : " + record.getUserName());
		}

		System.out.println("\n----Updating Record with ID = 2 -----");
		userDao.update(1L, "parthi");

		userDao.remove(1L);

		System.out.println("\n----Listing Record with ID = 2 -----");

		UserBean user = userDao.get(1L);

		System.out.print("ID : " + user.getUserId());

		System.out.print(", Name : " + user.getUserName());

	}
}
