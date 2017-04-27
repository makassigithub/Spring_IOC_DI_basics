

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.makas.services.CarServiceImpl;

public class MainClass {

	public static void main(String[] args) {
    
	 ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	 CarServiceImpl csi = appContext.getBean("carService",CarServiceImpl.class);
	 
	 System.out.println(csi.findAllCars().get(0).getMillage());

	}

}
