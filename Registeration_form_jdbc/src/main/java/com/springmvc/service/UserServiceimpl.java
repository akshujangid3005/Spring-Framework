package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserDao userdao;
	

	@Override
	public int registerUser(User user) {
		
		int i= userdao.saveUser(user);
		return i;
	}

}
