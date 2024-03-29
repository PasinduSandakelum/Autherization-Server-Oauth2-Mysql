package com.pasindu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}

}
