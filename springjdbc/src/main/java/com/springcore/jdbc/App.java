package com.springcore.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        StudentDao studentDao= context.getBean("stu",StudentDao.class);
       
		/* For insertion */
		/*
		 * Student student=new Student(); 
		 * student.setId(144);
		 * student.setName("Harshit"); 
		 * student.setCity("Jarara");
		 * int result=studentDao.insert(student);
		 * System.out.println("NO. of record inserted"+result);
		 */
        
		/* For Update */
        
//        Student student=new Student(); 
//        student.setId(144);
//        student.setName("Little"); 
//		student.setCity("Jarara");
//		int result=studentDao.change(student);
//		System.out.println("NO. of record updated"+result);
        
    	//  Delete
        
//         int result=studentDao.delete(113);
//         System.out.println("NO. of record deleted"+result);
         
//         For selecting single data
         
//         Student student= studentDao.getStudent(111);
//         System.out.println(student);
        
//        For selecting multiple data
        
          List<Student> students= studentDao.getAllStudents();
          for(Student s : students){
        	 System.out.println(s);
          }
    }
}
