package com.batuhanaslan.springmongorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringMongoRestApi {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoRestApi.class, args);
	}

}
