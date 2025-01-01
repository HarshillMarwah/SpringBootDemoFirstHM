package com.learning.SpringBootTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTestingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestingApplication.class, args);
		System.out.println("Hi");
		Alien obj = context.getBean(Alien.class);
		obj.code();
		System.out.println("Age="+obj.getAge());


	}

}
