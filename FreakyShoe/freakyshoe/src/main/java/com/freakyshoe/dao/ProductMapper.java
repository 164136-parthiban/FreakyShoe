package com.freakyshoe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.freakyshoe.bean.ProductBean;
import com.freakyshoe.bean.UserBean;

public class ProductMapper implements RowMapper {

	public ProductBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductBean product = new ProductBean();
		product.setProductId(rs.getLong("productId"));
		product.setProductName(rs.getString("productName"));
		product.setPrice(rs.getDouble("price"));
		product.setQuantity(rs.getInt("quantity"));
		return product;
	}

}
