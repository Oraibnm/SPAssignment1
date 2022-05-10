package com.springboot.app.SPTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Clock;

@SpringBootApplication
public class SpTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpTestApplication.class, args);
		System.out.println("Hello Word !");
	}

}
