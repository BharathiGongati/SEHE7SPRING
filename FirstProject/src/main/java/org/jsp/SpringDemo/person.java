package org.jsp.SpringDemo;

public class person {
	private int age;
	private String name;
	public void display() {
		System.out.println("age:"+age);
		System.out.println("name:"+name);
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
	public void setName(String name) {
		this.name = name;
	}

}
