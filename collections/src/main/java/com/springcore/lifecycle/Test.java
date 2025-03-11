package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/cyconfig.xml");
        Game g=(Game) context.getBean("g");
        System.out.println(g);
        context.registerShutdownHook(); 
	}

}
