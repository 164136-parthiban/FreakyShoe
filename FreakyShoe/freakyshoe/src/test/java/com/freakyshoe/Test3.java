package com.freakyshoe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.freakyshoe.dao.UserDao;
import com.freakyshoe.service.LoginService;

public class Test3 
{
 
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		LoginService login = context.getBean("login",LoginService.class);
		
	/*LoginService login = new LoginService();*/
	String text=login.isValid("madhuri", "parthi123");
	System.out.println(text);
	login.addUser("parthi", "parthi", 4);
	
    }
}
