

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.makas.services.CarServiceImpl;

public class MainClass {

	public static void main(String[] args) {
    
	//Wil demonstrate that singleton uses the same bean 
	 ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	 CarServiceImpl csi = appContext.getBean("carService",CarServiceImpl.class);
	 System.out.println(csi);
	 
	 CarServiceImpl csi2 = appContext.getBean("carService",CarServiceImpl.class);
	 System.out.println(csi2);
	 /* OUTPUT: 
	    The default constructor 
        we are using setter injection
        com.makas.services.CarServiceImpl@5fcd892a
        com.makas.services.CarServiceImpl@5fcd892a
12000

	  */
	 
	 System.out.println(csi.findAllCars().get(0).getMillage());

	}

}
