package com.makas.app;

import com.makas.services.CarServiceImpl;
import com.makas.services.CarServiceInterf;

public class MainClass {

	public static void main(String[] args) {
	 CarServiceInterf csi = new CarServiceImpl();
	 System.out.println(csi.findAllCars().get(0).getMillage());

	}

}
