package org.jsp.Spring;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class DynamicInsert {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		int r=template.execute("insert into user values(?,?,?,?)",new MyPreparedStatemtCallback());
		System.out.println(r+" "+"rows inserted");
		
		
	}

}
class MyPreparedStatemtCallback implements PreparedStatementCallback<Integer>{

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		ps.setInt(1, 1);
		ps.setLong(2, 222);
		ps.setString(3, "bittu@gmail.com");
		ps.setString(4, "bi@123");
		return ps.executeUpdate();
	}
	
}
