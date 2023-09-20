package com.springmvc.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.User;

@Repository    
public class UserDao {

	@Autowired
	private HibernateTemplate  hibernatetemplate;
	
	@Transactional
	public int save(User user)
	{
	int i=(Integer) hibernatetemplate.save(user);
		return i;
	}
	
}
