package org.jsp.Springinitialization;

import org.springframework.stereotype.Component;

@Component("train")
public class Train  implements Vehicle{

	public void start() {
		    System.out.println("train started");
	}

}
