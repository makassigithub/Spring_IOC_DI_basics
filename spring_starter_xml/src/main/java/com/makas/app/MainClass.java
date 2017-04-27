package com.makas.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makas.services.CarServiceImpl;

public class MainClass {

	public static void main(String[] args) {
	
	//Refer to beans by their names from the Application context
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	CarServiceImpl csi = context.getBean("carServiceBean",CarServiceImpl.class) ;                
	 System.out.println(csi.findAllCars().get(0).getMillage());

	}

}
