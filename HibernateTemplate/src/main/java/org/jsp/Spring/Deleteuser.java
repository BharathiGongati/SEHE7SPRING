package org.jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Deleteuser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		template.execute("delete from user where id=3");
		System.out.println("record deleted");
	}

}
