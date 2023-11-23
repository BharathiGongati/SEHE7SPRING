package org.jasp.Springdemo;

public class PanCard {
	private String number;
	private String name;
	public void display() {
		System.out.println("panCard Number:"+number);
		System.out.println("Name:"+name);

	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
