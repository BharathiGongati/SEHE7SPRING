package org.jasp.Springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("PanCard.xml");
		PanCardHolder holder=context.getBean("myPerson",PanCardHolder.class);
		holder.getCard().display();
	}

}
