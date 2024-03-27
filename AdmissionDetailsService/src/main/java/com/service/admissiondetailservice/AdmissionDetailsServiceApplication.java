package com.service.admissiondetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdmissionDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionDetailsServiceApplication.class, args);
	}

}
