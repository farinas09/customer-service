package com.farinas.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {


	public static void main(String[] args) {
		System.setProperty("user.timezone", "America/Managua");
		SpringApplication.run(CustomerApplication.class, args);
	}

}
