package org.jsp.lifecycle;

public class Test {
	static {
		System.out.println("Test class has been loaded into jvm");
	}
	public Test() {
		System.out.println("Test object is getting is created");
	}
	public void hii() {
		System.out.println("hii called from init method");
		
	}
	public void bye() {
		System.out.println("bye if destroyed");
		
	}
	

}
