package com.example.specialrouteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpecialrouteserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecialrouteserviceApplication.class, args);
	}

}
