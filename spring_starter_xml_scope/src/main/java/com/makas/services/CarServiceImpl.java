package com.makas.services;

import java.util.List;

import com.makas.model.Car;
import com.makas.repository.CarRepoInterf;
import com.makas.repository.CarRepoStubImpl;

public class CarServiceImpl implements CarServiceInterf {

// The interface is used to set the repository
//Ensure you use the same binding bean name for CarRepo inside the CarService
private CarRepoInterf carRepo;

//Setter injection
public void setCarRepo(CarRepoInterf car_repo) {
	this.carRepo = car_repo;
}

//Empty constructor used by our unit test
public CarServiceImpl()  {
}


//Use for dependency injection arg at index0 refers to carRepo
public CarServiceImpl(CarRepoInterf carRepo) {
	super();
	this.carRepo = carRepo;
}
@Override
public List<Car> findAllCars(){
	   
	   return carRepo.findAllCars();	   
   }
}
