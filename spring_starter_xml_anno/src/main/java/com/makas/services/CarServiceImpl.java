package com.makas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makas.model.Car;
import com.makas.repository.CarRepoInterf;

@Service("carServiceBean")
public class CarServiceImpl implements CarServiceInterf {

	// Autowire on a member: create a bean from carRepoInterfImpl and inject it
	// @Autowired
	private CarRepoInterf crep;
	
	// Autowire on a constructor this affect the default constructor
	// @Autowired
	public CarServiceImpl(CarRepoInterf crep) {
		super();
		System.out.println("Wired using constructor");
		this.crep = crep;
	}

	// Autowire on a setter
	// @Autowired
	public void setCrep(CarRepoInterf crep) {
		System.out.println("Wiring using a setter");
		this.crep = crep;
	}

	@Override
	public List<Car> findAllCars() {

		return crep.findAllCars();

	}
}
