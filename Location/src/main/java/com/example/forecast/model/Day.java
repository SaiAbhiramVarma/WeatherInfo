package com.example.forecast.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Day {
    float maxtemp_c;
    float mintemp_c;
    float avgtemp_c;
    float maxwind_mph;
    float maxWind_kph;

}
