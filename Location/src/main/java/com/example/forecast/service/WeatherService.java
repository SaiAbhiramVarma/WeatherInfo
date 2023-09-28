package com.example.forecast.service;

import com.example.forecast.model.Weather;
import com.example.forecast.model.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService{
    @Autowired
    RestTemplate restTemplate;


    public Weather getCurrentWeather(String location){

        Weather weather=restTemplate.getForObject("http://localhost:9000/currentWeather/"+location, Weather.class);

        return weather ;

    }

    public WeatherForecast getWeatherForecast(String location,String day) {
        WeatherForecast weatherForecast=restTemplate.getForObject("http://localhost:9001/forecast/"+location+"/"+day, WeatherForecast.class);
        return weatherForecast;

    }

}


