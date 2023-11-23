package org.jsp.SpringDemo;

public class User {
	private long phone;
	private String password;
    public void display() {
		System.out.println("phone number:"+phone);
		System.out.println("password: "+password);
		
	}
	public User() {
		System.out.println("no argument constructor");
	}
	public User(long phone, String password) {
		super();
		this.phone = phone;
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
