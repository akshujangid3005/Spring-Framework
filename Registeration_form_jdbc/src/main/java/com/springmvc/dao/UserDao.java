package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;


@Repository
public class UserDao {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveUser(User user) 
	{
	String sql="insert into user(name,email,password,Action ) values(?,?,?,?)";
	int i=jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPassword(),user.getAction());
	return i;
	}
	
}
