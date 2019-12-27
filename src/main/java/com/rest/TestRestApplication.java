package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.api","com","com.apir.modelo","com.rest"})

@EnableAutoConfiguration
@Configuration
//@EnableScheduling
@ComponentScan({"com"})
//@ComponentScan({"com.delivery.request"})
@EntityScan("com")
//@EnableJpaRepositories("com.api.modelo.repository")
@EnableJpaRepositories("com")
public class TestRestApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TestRestApplication.class, args);
	}

}
