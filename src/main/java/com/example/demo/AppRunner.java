package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

//	@Value("${spring.application.name}")
	@Value("${my.property}")
	private String name;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Name: ".concat(name));
	}

}
