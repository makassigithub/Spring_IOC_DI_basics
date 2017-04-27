import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.makas.repository.CarRepoInterf;
import com.makas.repository.CarRepoStubImpl;
import com.makas.services.CarServiceImpl;
import com.makas.services.CarServiceInterf;

@Configuration
@ComponentScan({"com.makas"}) // We need this for @Autowired
public class AppConfig {

//Create a bean for CarService
//We use an Interf as return type but the instance returned is the impl.
	
	@Bean(name="carService")
	public CarServiceInterf getCarService(){
		
    //When using constructor injection
	//CarServiceImpl carService = new CarServiceImpl(getCarRepository());
	
	//When using setter injection
	CarServiceImpl carService = new CarServiceImpl();
	               //carService.setCarRepository(getCarRepository());@Autowired doesn,t need this.
	               return carService;
	                 
	//return new CarServiceImpl();
	}
	@Bean(name="carRepository")
	public CarRepoInterf getCarRepository(){	
		return new CarRepoStubImpl();		
	}
	
	/* if we use @autowire, folling the bean naming convention and annotate
	 our bean classes with the steros (@Service && @ Repository), we don,t even
	 need to define beans in the config file
	 */
}
