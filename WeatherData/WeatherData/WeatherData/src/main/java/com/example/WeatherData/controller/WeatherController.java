package com.example.WeatherData.controller;

import com.example.WeatherData.model.Weather;
import com.example.WeatherData.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @RequestMapping("/currentWeather/{location}")
    public Weather currentWeather(@PathVariable("location") String location) {
        System.out.println(location);
        return weatherService.getCurrentWeather(location);
    }
}
