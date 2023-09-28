package com.example.forecast.service;

import com.example.forecast.model.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.forecast.model.Forecast;
import com.example.forecast.model.WeatherForecast;
@Service
public class ForecastService {

    @Autowired
    public RestTemplate restTemplate;


    public WeatherForecast getForecastWeather(String location,String day) {
        return restTemplate.getForObject("http://api.weatherapi.com/v1/forecast.json?key=aa3a0f8a1c4f497495d145533233008 &q="
                +location+"&days="
                +day+ "&aqi=no&alerts=no", WeatherForecast.class);
    }

}
