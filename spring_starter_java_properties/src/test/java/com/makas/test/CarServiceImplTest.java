package com.makas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.makas.services.CarServiceImpl;
import com.makas.services.CarServiceInterf;

public class CarServiceImplTest {

	@Test
	public void test() {
		 CarServiceInterf csi = new CarServiceImpl();
		 assertEquals(csi.findAllCars().get(0).getBrand(),"Mazda");
	}

}
