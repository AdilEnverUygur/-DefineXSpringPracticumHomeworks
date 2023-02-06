package com.adilenver.controller;

import com.adilenver.dto.WeatherResponse;
import com.adilenver.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String getWeatherPage(Model model,String city) {
        WeatherResponse weather = weatherService.getWeatherByCity(city);
        model.addAttribute("weather", weather);
        return "weather";
    }
}
