package com.jenkis.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootJenkisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootJenkisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola soy jenkins desde java");
	}

}
