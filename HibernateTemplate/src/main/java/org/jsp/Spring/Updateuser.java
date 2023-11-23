package org.jsp.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Updateuser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		template.execute("update  user set phone=111 where id=1");
		System.out.println("record updated");

		
	}
	
}
