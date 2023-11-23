package org.jsp.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("org.jsp.SpringAnnotation");
		Car c=context.getBean(Car.class);
		c.start();
		
	}

}
