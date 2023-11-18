package com.example.mealserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MealserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealserveApplication.class, args);
	}

}
