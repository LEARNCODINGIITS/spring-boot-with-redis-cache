package com.iits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootwithRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootwithRedisCacheApplication.class, args);
	}

}
