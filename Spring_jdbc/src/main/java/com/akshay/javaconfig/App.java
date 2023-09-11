package com.akshay.javaconfig;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
public static void main(String[] args) throws SQLException {
 ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
 JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
	System.out.println(jd.getDataSource().getConnection());
	
	 String sql= "insert into employe(id,name,address)values(?,?,?)";
	 int i= jd.update(sql,32,"Akshay jangid","jaipur");
	 System.out.println("Succsesfuly inserted"+i);
}
}
  	  	 	  