package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeResource {

	@GetMapping(path = "/now")
	public String now() {
		return LocalDateTime.now().toString();
	}

}
