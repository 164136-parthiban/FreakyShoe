package com.freakyshoe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.freakyshoe.service.LoginService;
import com.freakyshoe.service.ProductService;

public class Test4 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ProductService product = context.getBean("product",ProductService.class);
	
		System.out.println(product.getAllProducts());
		System.out.println(product.getProductDetails(2));
    }

}
