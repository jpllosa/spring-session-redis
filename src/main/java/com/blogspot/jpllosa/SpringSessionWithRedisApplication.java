package com.blogspot.jpllosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSessionWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionWithRedisApplication.class, args);
	}

}

// mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081

// 127.0.0.1:6379> keys *

// 127.0.0.1:6379> del spring:session:sessions:0f49aeb0-df49-4910-a3ec-4aabbe8618a2

// sudo service redis-server start