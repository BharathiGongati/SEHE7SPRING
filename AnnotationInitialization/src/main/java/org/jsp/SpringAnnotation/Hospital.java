package org.jsp.SpringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Hospital {
	private String name;
	private String founder;
	public Hospital(@Value(value="kavitha") String name,@Value(value="harshu")
			String founder) {
		super();
		this.name = name;
		this.founder = founder;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("founder"+founder);
	}

}
