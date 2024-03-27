package com.service.feesManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeesManagementServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeesManagementServicesApplication.class, args);
	}

}
