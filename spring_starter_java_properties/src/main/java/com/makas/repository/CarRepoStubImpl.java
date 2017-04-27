package com.makas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.makas.model.Car;

//@Repository("carRepository")
public class CarRepoStubImpl implements CarRepoInterf {
	
    @Value("${db_name}")
	private String databasename;
	
	@Override
	public List<Car> findAllCars(){
		System.out.println("db_name from propery is :"+databasename);
      List<Car> cars = new ArrayList<Car>();
      Car car1 = new Car();
          car1.setBrand("Mazda");
          car1.setMillage(12000);
       cars.add(car1);
        return cars;
         
	}
}
