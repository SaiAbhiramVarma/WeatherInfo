package com.example.forecast;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

@EnableEurekaClient
@OpenAPIDefinition(info = @Info(title = "Location", description = "Location Management"))
public class ForecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForecastApplication.class, args);
	}

}
