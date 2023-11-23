package org.jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Insertion {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		template.execute("create table user(id int not null,phone bigint(30) not null,emai varchar(45) not null,password varchar(30) not null,primary key(id))");
		System.out.println("table created");
		
	}
	
	

}
