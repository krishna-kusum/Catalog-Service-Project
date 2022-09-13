package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com" )
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.persistence")
@EnableEurekaClient
public class CatalogServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceProjectApplication.class, args);
	}

}
