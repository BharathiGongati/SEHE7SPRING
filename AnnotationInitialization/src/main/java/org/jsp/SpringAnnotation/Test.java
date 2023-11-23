package org.jsp.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("org.jsp.SpringAnnotation");
		Person p=context.getBean(Person.class);
		p.display();
		Hospital h=context.getBean(Hospital.class);
		h.display();
	}

}
