package com.jorge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * Try:
 * 		http://localhost:8001/microspring2-cloud-client-lab3/default/  => You should see the JSON result that will actually be used by Spring
 * 
 */
@SpringBootApplication
@EnableConfigServer
public class Microspring2CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microspring2CloudServerApplication.class, args);
	}
}
