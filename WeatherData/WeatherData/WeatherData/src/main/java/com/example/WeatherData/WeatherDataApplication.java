package com.example.WeatherData;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@OpenAPIDefinition(info = @Info(title = "Weather Data", description = "Current Data Weather Management"))
@SpringBootApplication
@EnableEurekaClient

public class WeatherDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
