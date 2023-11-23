package org.jsp.Spring;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class DynamicUpdate {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		int r=template.execute("update user set phone=? where id=?",new MyPreparedStatemtCallback3());
		System.out.println(r+" "+"rows updated");
		
	}

}
class MyPreparedStatemtCallback3 implements PreparedStatementCallback<Integer>{

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the phone to update and which row you have to update");
		 long phone=s.nextLong();
		 int id=s.nextInt();
		ps.setLong(1,phone );
		ps.setInt(2, id);
		
		
		return ps.executeUpdate();
	}
		
}
