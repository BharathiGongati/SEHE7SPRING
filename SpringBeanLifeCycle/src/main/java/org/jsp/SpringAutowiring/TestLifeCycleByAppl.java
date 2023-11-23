package org.jsp.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleByAppl {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");
		Demo d=context.getBean("demo",Demo.class);
	}

}
