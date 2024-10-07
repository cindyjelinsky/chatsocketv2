package com.cindyhj.Webchatv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Webchatv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Webchatv2Application.class, args);
		System.out.println("Server Listening on port 5000:\n");
	}

}
