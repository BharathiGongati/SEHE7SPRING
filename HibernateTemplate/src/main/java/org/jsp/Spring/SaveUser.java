package org.jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveUser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
//		template.execute("insert into user values(3,677,'kk@123','cccc')");
//		System.out.println("record saved");
		template.execute("delete from user where id=1");
		System.out.println("deleted");
	}

}
