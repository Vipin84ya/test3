package com.vipin.test.vipin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	int x = 100;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
