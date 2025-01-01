package com.learning.SpringBootTesting;

import com.learning.SpringBootTesting.model.Alien;
import com.learning.SpringBootTesting.model.Laptop;
import com.learning.SpringBootTesting.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTestingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestingApplication.class, args);
		System.out.println("Hi");
		LaptopService service=context.getBean(LaptopService.class);
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println("Age="+obj.getAge());
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


	}

}
