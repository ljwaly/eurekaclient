package com.ljw.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EurekaClientApplication.class, args);
		ConfigurableEnvironment environment = context.getEnvironment();
		String port = environment.getProperty("server.port");
		
		System.out.println("***********************************************");
		System.out.println("		Eureka-Client:");
		System.out.println("		http://localhost:" + port);
		System.out.println("		is OK");
		System.out.println("***********************************************");
		
	}


	
}
