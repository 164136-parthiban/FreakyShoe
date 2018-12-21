package com.freakyshoe.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.freakyshoe.bean.UserBean;

public class UserDao {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) 
	{
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	public void add(String userName, String password, long id) {
		String SQL = "insert into USERDETAIL (userId,userName,password) values (?,?,?)";
		jdbcTemplateObject.update(SQL, id, userName, password);
		System.out.println("Created Record Name = " + userName + " id = " + id);
		
	}

	public UserBean get(long userId) {
		String SQL = "select * from USERDETAIL where userId = ?";
		UserBean user = jdbcTemplateObject.queryForObject(SQL, new Object[] { userId }, new UserMapper());
		return user;
	}

	public List<UserBean> getAll() {
		String SQL = "select * from USERDETAIL";
		List<UserBean> UserBeans = jdbcTemplateObject.query(SQL, new UserMapper());
		return UserBeans;
	}

	public void remove(long id) {
		String SQL = "delete from USERDETAIL where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with userId = " + id);
		return;
	}

	public void update(long id, String password) {
		String SQL = "update USERDETAIL set password = ? where userId = ?";
		jdbcTemplateObject.update(SQL, password, id);
		System.out.println("Updated Record with userId = " + id);
		return;
	}

}