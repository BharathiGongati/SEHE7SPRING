package org.jsp.SpringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value="22")
	private int age;
	private String name;
	public void display()
	{
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("------------------");
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Value(value="bharu")
	public void setName(String name) {
		this.name = name;
	}

}
