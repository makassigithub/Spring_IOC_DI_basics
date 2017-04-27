package com.makas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.makas.model.Car;

@Repository("carRepoBean")
public class CarRepoStubImpl implements CarRepoInterf {

	@Override
	public List<Car> findAllCars(){
		
      List<Car> cars = new ArrayList<Car>();
      Car car1 = new Car();
          car1.setBrand("Mazda");
          car1.setMillage(12000);
       cars.add(car1);
        return cars;
         
	}
}
