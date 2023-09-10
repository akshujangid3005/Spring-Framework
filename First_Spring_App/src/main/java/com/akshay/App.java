package com.akshay;

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
//      Action Ac=new yogesh();
//      Ac.sleep();
//      Ac.eat();
//      Ac.run();
    	
    	ApplicationContext context= new  ClassPathXmlApplicationContext("com/akshay/config.xml");
    	System.out.println(context);
    	Ritik ritik= context.getBean("people",Ritik.class);
    	ritik.eat();
    	ritik.sleep();
    	ritik.run();
    	
//    	yogesh yogi= context.getBean("people",yogesh.class);
//    	yogi.eat();
//    	yogi.sleep();
//    	yogi.run();
//      
      
     
        
    }
}