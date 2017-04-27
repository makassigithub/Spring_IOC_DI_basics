package com.makas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makas.model.Car;
import com.makas.repository.CarRepoInterf;

//@Service("carService")
public class CarServiceImpl implements CarServiceInterf {
  
   //@Autowired
   private CarRepoInterf carRepository;
 
   public CarServiceImpl(){
		System.out.println("The default constructor ");
	  }
	   

  public CarServiceImpl(CarRepoInterf carRepository){
	  this.carRepository = carRepository;   
	  System.out.println("we are using constructor injection");
  }
   
  @Autowired
  public void setCarRepository(CarRepoInterf carRepository) {
	this.carRepository = carRepository;
	System.out.println("we are using setter injection");
}


@Override
public List<Car> findAllCars(){
	   
	   return carRepository.findAllCars();
	   
   }
}
