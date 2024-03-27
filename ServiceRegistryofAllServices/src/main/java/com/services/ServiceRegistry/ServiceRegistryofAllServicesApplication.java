package com.services.ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryofAllServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryofAllServicesApplication.class, args);
	}
//    hit http://localhost:8761 in chrome
}
