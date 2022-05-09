package com.nirsa.nw.web.app.enlacemiddleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicioEnlaceMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEnlaceMiddlewareApplication.class, args);
	}

}
