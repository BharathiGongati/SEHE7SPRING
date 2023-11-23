package org.jsp.lifecycle;

public class Test2 {
	static {
		System.out.println("Test2 class has been loaded into jvm");
	}
	public Test2() {
		System.out.println("Test2 object is getting is created");
	}
	public void hii() {
		System.out.println("hii called from init method Test2");
		
	}
	public void bye() {
		System.out.println("bye if destroyed Test2");
		
	}

}
