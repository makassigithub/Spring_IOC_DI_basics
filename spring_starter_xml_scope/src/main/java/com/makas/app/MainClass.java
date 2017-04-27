package com.makas.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makas.services.CarServiceImpl;

public class MainClass {

	public static void main(String[] args) {
	
	//Refer to beans by their names from the Application context
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*
   // demonstrate the singleton scope
	//ystem.out.println("SINGLATON SCOPE");
	CarServiceImpl csi = context.getBean("carServiceBean",CarServiceImpl.class) ; 
	               System.out.println(csi);              
	CarServiceImpl csi2 = context.getBean("carServiceBean",CarServiceImpl.class) ; 
	System.out.println(csi2);	               
	System.out.println(csi.findAllCars().get(0).getMillage());
	
	 OUTPOUT
	   com.makas.services.CarServiceImpl@58651fd0
       com.makas.services.CarServiceImpl@58651fd0
       12000

	 */
	// demonstrate the singleton prototype
	System.out.println("PROTOTYPE SCOPE");
		CarServiceImpl csi3 = context.getBean("carServiceBean",CarServiceImpl.class) ; 
		               System.out.println(csi3);              
		CarServiceImpl csi4 = context.getBean("carServiceBean",CarServiceImpl.class) ; 
		System.out.println(csi4);	               
		
	}

}
