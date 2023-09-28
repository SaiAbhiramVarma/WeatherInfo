package com.example.forecast.controller;

import com.example.forecast.model.Weather;
import com.example.forecast.model.WeatherForecast;
import com.example.forecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @RequestMapping("/getCurrentWeather/{location}")
    public Weather getWeather(@PathVariable("location") String location) {
        return weatherService.getCurrentWeather(location);
    }

    @RequestMapping("/getForecatWeather/{location}/{days}")
    public WeatherForecast getForecastWeather(@PathVariable("location") String location, @PathVariable("days") String days) {
        return weatherService.getWeatherForecast(location, days);
    }
}
