package com.spring.jdbc.SpringJdbcMavenDemo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class DbConfig {

	@Bean(name =  "ds1")
	public DataSource dataSource()
	{
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost:8889/voda2023");
		db.setUsername("root");
		db.setPassword("root");
		return db;
	}
	@Bean(name = "ds2")
	public DataSource dataSource1()
	{
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("com.mysql.cj.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost:8889/gl2023");
		db.setUsername("root");
		db.setPassword("root");
		return db;
	}
	// template design pattern => JdbcTemplate
	@Bean
	@Autowired
	public JdbcTemplate template(
			@Qualifier("ds1")DataSource ds)
	{
		return new JdbcTemplate(ds);
	}
	
}
