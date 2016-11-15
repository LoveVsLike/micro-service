package lizo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComputerApplication {
	
	   public static void main(String[] args) {
	        SpringApplication.run(ComputerApplication.class, args);
	    }

}
