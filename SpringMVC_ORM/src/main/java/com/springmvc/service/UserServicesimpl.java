package com.springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;
@Service 	 
public class UserServicesimpl implements UserServices{
	
	@Autowired
	private UserDao userDao;
	
	public int saveUser(User user) {

	int i=	userDao.save(user);
		return i;
	}
	

}
