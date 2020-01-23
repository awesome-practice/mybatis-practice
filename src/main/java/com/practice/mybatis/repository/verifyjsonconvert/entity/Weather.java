package com.practice.mybatis.repository.verifyjsonconvert.entity;

public class Weather {
    private Long id;

    private Integer temperature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}