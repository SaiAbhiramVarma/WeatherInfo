package com.example.WeatherData.service;

import com.example.WeatherData.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    public RestTemplate restTemplate;

    public Weather getCurrentWeather(String location) {
        return restTemplate.getForObject("https://api.weatherapi.com/v1/current.json?key=aa3a0f8a1c4f497495d145533233008&q="
                + location + "&aqi=yes", Weather.class);
    }
}