package com.freakyshoe.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.freakyshoe.bean.ProductBean;
import com.freakyshoe.bean.UserBean;

public class ProductDao {
	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	public void add(String productName, double price, long id,int quantity) {
		String SQL = "insert into PRODUCTDETAIL (productId,productName,price,quantity) values (?,?,?,?)";
		jdbcTemplateObject.update(SQL, id, productName, price , quantity);
		System.out.println("Created Record Name = " + productName + " id = " + id);

	}

	public ProductBean get(long productId) {
		String SQL = "select * from PRODUCTDETAIL where productId = ?";
		ProductBean product = jdbcTemplateObject.queryForObject(SQL, new Object[] { productId }, new ProductMapper());
		return product;
	}

	public List<ProductBean> getAll() {
		String SQL = "select * from PRODUCTDETAIL";
		List<ProductBean> productBeans = jdbcTemplateObject.query(SQL, new ProductMapper());
		return productBeans;
	}

	public void remove(long id) {
		String SQL = "delete from PRODUCTDETAIL where productId = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with productId = " + id);
		return;
	}

	public void update(long id, int quantity) {
		String SQL = "update PRODUCTDETAIL set quantity = ? where productId = ?";
		jdbcTemplateObject.update(SQL, quantity, id);
		System.out.println("Updated Record with productId = " + id);
		return;
	}

}
