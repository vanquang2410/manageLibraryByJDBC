package com.example.learnJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan
@SpringBootApplication
public class LearnJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJdbcApplication.class, args);
	}

}
