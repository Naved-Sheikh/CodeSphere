package com.codesphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CodesphereDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodesphereDiscoveryServerApplication.class, args);
	}

}
