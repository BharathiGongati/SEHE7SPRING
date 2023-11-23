package org.jsp.Spring;

import java.awt.Desktop.Action;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class Fetchuser {

	public static <T> void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		
        String r=template.query("select * from user", new  MyResultSetExtractor());
        System.out.println(r);
        
        
       }
}
class MyResultSetExtractor implements ResultSetExtractor<String>{

	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getLong(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
		}
		return "The data has been printed";
		
	}
	
}
