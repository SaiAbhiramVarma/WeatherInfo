package com.example.WeatherData.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    String name;
    String region;
    String country;
    float lat;
    float lon;
    String tz_id;
    long localtime_epoch;
    String localtime;
}
