package com.example.forecast.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    public int Id;
    String name;
    String region;
    String country;
    float lon;
     float lat;
    String tz_id;
    long localtime_epoch;
    String localtime;

}
