package com.mock.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockServiceApplication.class, args);
	}

}
