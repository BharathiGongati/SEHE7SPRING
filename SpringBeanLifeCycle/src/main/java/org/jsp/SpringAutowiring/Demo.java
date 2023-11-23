package org.jsp.SpringAutowiring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean
{
	static {
		System.out.println("Demo class has been loaded into jvm");
	}
	public Demo() {
		System.out.println("Demo object is getting is created");
	}
	public void destroy() throws Exception {
		System.out.println("Demo object id destroyed");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo Object is initialized");
		
	}
	

}
