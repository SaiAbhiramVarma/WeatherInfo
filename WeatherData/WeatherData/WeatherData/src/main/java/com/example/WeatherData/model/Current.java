package com.example.WeatherData.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Current {
    long last_updated_epoch;
    String last_updated;
    float temp_c;
    float temp_f;
    int is_day;
    float wind_mph;
    float wind_kph;
    float wind_degree;
    float humidity;
}
