package com.akshay.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class config {

	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Akshay@2001");
		return dataSource;
	}

	@Bean("jdbc")
	public JdbcTemplate getJdbctemplate() {
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
}
