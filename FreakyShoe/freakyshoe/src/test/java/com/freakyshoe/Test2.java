package com.freakyshoe;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.freakyshoe.bean.ProductBean;
import com.freakyshoe.dao.ProductDao;

public class Test2 
{

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		ProductDao productDao = context.getBean(ProductDao.class);
		
		System.out.println("------Records Creation--------");
		productDao.add("gucci", 2000, 1, 10);
		productDao.add("?", 200, 2, 10);
		productDao.add("gucci", 2000, 3, 10);
		

		System.out.println("\n------Listing Multiple Records--------");

		List<ProductBean> users = productDao.getAll();

		for (ProductBean record : users) {
			System.out.print("ID : " + record.getProductId());
			System.out.print(", Name : " + record.getProductName());
		}

		System.out.println("\n----Updating Record with ID = 2 -----");
		productDao.update(1,20);

		productDao.remove(1);

		System.out.println("\n----Listing Record with ID = 2 -----");

		ProductBean user = productDao.get(1L);

		System.out.print("ID : " + user.getProductId());

		System.out.print(", Name : " + user.getProductName());

	}

}
