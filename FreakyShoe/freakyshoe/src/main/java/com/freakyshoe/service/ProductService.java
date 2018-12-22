package com.freakyshoe.service;

import java.util.List;

import com.freakyshoe.bean.ProductBean;
import com.freakyshoe.dao.ProductDao;

public class ProductService 
{
	ProductDao dao = new ProductDao();
	
	public List<ProductBean> getAllProducts()
	{	
		return dao.getAll();	
	}

	public ProductBean getProductDetails(long productId)
	{
		return dao.get(productId);
	}
}
