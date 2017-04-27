package com.makas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.makas.model.Car;

public class CarRepoStubImpl implements CarRepoInterf {
    
	@Value("${db_name}")
	private String databaseName;
	
	//We need the setter when using xml
	/*public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}  */
	
	@Override
	public List<Car> findAllCars(){
		
		System.out.println(databaseName);
		
      List<Car> cars = new ArrayList<Car>();
      Car car1 = new Car();
          car1.setBrand("Mazda");
          car1.setMillage(12000);
       cars.add(car1);
        return cars;
         
	}
}
