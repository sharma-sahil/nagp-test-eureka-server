package com.nagarro.nagp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NagpTestEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NagpTestEurekaServerApplication.class, args);
	}

}
