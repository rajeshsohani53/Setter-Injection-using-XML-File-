package com.rajesh.springcore.SpringCore_Practice01;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student Studentobj=context.getBean(Student.class);
        System.out.println(Studentobj);
        
    }
}
