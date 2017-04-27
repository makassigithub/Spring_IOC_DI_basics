package com.makas.services;

import java.util.List;

import com.makas.model.Car;
import com.makas.repository.CarRepoInterf;
import com.makas.repository.CarRepoStubImpl;

public class CarServiceImpl implements CarServiceInterf {
   private CarRepoInterf crep = new CarRepoStubImpl();
   
   /* (non-Javadoc)
 * @see com.makas.services.CarServiceInterf#findAllCars()
 */
@Override
public List<Car> findAllCars(){
	   
	   return crep.findAllCars();
	   
   }
}
