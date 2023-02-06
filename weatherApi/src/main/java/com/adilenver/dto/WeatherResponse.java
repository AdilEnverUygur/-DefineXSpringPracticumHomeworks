package com.adilenver.dto;

import lombok.Data;

@Data
public class WeatherResponse {

    private String temperature;
    private String humidity;
    private String windSpeed;
    private String description;
    private String city;
}
