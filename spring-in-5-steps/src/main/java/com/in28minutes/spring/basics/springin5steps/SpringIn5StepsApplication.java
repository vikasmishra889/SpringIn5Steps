package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn5StepsApplication.class, args);
		System.out.println("Spring Container Started.");
		System.out.println("Spring Container Ready");
		System.out.println("Another sysout");
		System.out.println("Another sysout 1");
		System.out.println("Another sysout 2");
	}
}
