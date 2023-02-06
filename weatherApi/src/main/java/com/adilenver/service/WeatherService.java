package com.adilenver.service;

import com.adilenver.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeatherByCity(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=YOUR_APP_ID";
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
        return response;
    }
}
