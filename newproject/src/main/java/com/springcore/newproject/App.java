package com.springcore.newproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com.springcore.newproject/configer.xml");
        @SuppressWarnings("unused")
		Student student1=(Student) context.getBean("Student1");
        System.out.println("student1");
    }
}
