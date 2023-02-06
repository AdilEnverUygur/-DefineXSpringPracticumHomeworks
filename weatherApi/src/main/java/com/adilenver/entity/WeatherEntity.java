package com.adilenver.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "temperature")
    private String temperature;
    @Column(name = "humidity")
    private String humidity;
    @Column(name = "wind_speed")
    private String windSpeed;
    @Column(name = "description")
    private String description;
}
