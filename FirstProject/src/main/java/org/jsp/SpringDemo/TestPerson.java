package org.jsp.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPerson {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("Car.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		person p=factory.getBean("myPerson", person.class);
		p.display();

	}
	
}
