package com.springboot.eo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.eo.controller"})
public class EoApplication {


	public static void main(String[] args) {
		SpringApplication.run(EoApplication.class, args);
	}
}
