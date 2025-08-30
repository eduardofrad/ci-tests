package com.fratris.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiApplication.class, args);
		System.out.printf("Result sum: " + sum(10.0, 10.0));
	}

	public static Double sum(Double arg1, Double arg2){
		return arg1 + arg2;
	}
}
