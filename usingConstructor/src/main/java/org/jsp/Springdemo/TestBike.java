package org.jsp.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
		Bike b=context.getBean("myBike",Bike.class);
		b.getE().start();
	}

}
