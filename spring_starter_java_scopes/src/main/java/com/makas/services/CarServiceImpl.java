package com.makas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import com.makas.model.Car;
import com.makas.repository.CarRepoInterf;

//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
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
