package com.example.devops;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class DevopsApplication {
	@GetMapping("/message")
	public String getMessage() {
		log.info("getMessage()");
		return "Welcome to Devops!!";
	}

	public static void main(String[] args) {

		SpringApplication.run(DevopsApplication.class, args);
	}

}
