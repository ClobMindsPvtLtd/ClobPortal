package com.clobportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.clobportal"})
@EnableAutoConfiguration
public class ClobportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClobportalApplication.class, args);
	}

}
