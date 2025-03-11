package com.springcoe.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoe/autowire/annotation/auto.xml");
          Emp emp1=context.getBean("emp1",Emp.class);
          System.out.println(emp1);
	}

}
