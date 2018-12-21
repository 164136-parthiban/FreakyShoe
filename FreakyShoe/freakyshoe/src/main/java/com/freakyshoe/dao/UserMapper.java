package com.freakyshoe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.freakyshoe.bean.UserBean;

public class UserMapper implements RowMapper<UserBean> {

	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserBean user = new UserBean();
		user.setUserId(rs.getLong("userId"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
