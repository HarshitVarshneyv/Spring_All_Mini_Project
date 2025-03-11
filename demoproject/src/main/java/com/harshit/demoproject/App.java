package com.harshit.demoproject;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/harshit/demoproject/New.xml");

          Student Student1=(Student) context.getBean("Student1");
          System.out.println(Student1);
          // Close the context to release resources
          ((ClassPathXmlApplicationContext) context).close();
    }
}

