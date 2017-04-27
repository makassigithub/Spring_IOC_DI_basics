import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.makas.repository.CarRepoInterf;
import com.makas.repository.CarRepoStubImpl;
import com.makas.services.CarServiceImpl;
import com.makas.services.CarServiceInterf;

@Configuration
@ComponentScan({"com.makas"}) 
public class AppConfig {
	
	@Bean(name="carService")
	public CarServiceInterf getCarService(){
	
	CarServiceImpl carService = new CarServiceImpl();               
	               return carService;
	                 
	}
	@Bean(name="carRepository")
	public CarRepoInterf getCarRepository(){	
		return new CarRepoStubImpl();		
	}

}
