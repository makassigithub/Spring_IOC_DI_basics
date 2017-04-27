import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.makas.repository.CarRepoInterf;
import com.makas.repository.CarRepoStubImpl;
import com.makas.services.CarServiceImpl;
import com.makas.services.CarServiceInterf;

@Configuration
@PropertySource("DB.properties")
public class AppConfig {
	 
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new  PropertySourcesPlaceholderConfigurer();
	}
	
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
