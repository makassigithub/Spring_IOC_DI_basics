package com.makas.repository;

import java.util.ArrayList;
import java.util.List;

import com.makas.model.Car;

public class CarRepoStubImpl implements CarRepoInterf {

	/* (non-Javadoc)
	 * @see com.makas.repository.CarRepoInterf#findAllCras()
	 */
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
