/*package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collection.xml");
        Emp emp1=(Emp) context.getBean("emp1");
         
        System.out.println(emp1.getName());
     
    }
}
*/

package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Load the Spring XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");

        // Retrieve the bean named "emp1" from the context
        Emp emp1 = (Emp) context.getBean("emp1");

        // Print the name of emp1
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
     // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
