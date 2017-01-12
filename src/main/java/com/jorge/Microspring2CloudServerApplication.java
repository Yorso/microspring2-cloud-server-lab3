package com.jorge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microspring2CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microspring2CloudServerApplication.class, args);
	}
}
