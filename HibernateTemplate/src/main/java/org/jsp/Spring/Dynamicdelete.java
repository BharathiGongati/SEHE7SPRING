package org.jsp.Spring;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class Dynamicdelete {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		int r=template.execute("delete from user where id=?",new MyPreparedStatemtCallback2());
		System.out.println(r+" "+"rows is deleted");
		
		
	}

}
class MyPreparedStatemtCallback2 implements PreparedStatementCallback<Integer>{

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		ps.setInt(1, 2);
		
		return ps.executeUpdate();
	}
		
}

