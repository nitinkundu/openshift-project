package com.recipe.cost.recipecost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(scanBasePackages = { "com.recipe" })
public class RecipeCostApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeCostApplication.class, args);
	}

}


