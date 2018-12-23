package com.frk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.frk.entity")
@ComponentScan(basePackages = "com.frk.controller")
@ComponentScan(basePackages = "com.frk.dao")
@EnableJpaRepositories(basePackages = "com.frk.jparepository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
