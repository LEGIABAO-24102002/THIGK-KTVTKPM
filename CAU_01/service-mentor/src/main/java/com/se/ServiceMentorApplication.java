package com.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class ServiceMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMentorApplication.class, args);
	}

}
// finish cache
