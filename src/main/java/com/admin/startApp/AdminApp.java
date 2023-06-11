package com.admin.startApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.admin.controller")
@ComponentScan("com.admin.service")
@EntityScan("com.admin.model")
@EnableJpaRepositories("com.admin.repository")

public class AdminApp {

	public static void main(String[] args) {
		SpringApplication.run(AdminApp.class, args);
	}

}
