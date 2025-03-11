package com.springcoe.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoe/autowire/auto.xml");
          Emp emp1=context.getBean("emp1",Emp.class);
          System.out.println(emp1);
	}

}


//
//for getter and setters alt+shift+s then press r
//default contructor     alt+shift+s then press c
//parametized contructor  alt+shift+s then press o
//toString  alt+shift+s then press s
//to close all windows ctrl+shift+w
//to save all file ctrl+ shift+ s