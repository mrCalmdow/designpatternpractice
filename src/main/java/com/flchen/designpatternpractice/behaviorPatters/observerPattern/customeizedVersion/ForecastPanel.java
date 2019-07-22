package com.flchen.designpatternpractice.behaviorPatters.observerPattern.customeizedVersion;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ForecastPanel implements Observer {

    private Subject weatherData;

    private Integer temperature;

    private String status;

    public ForecastPanel(Subject subject) {
        this.weatherData = subject;
    }

    public void subscribe() {
        weatherData.addObserver(this);
    }

    public void unsubscribe() {
        weatherData.deleteObserver(this);
    }

    @Override
    public void update(Integer temperature, String status) {

        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public void display() {
        log.info("[display] -- {}", this.status + this.temperature);
    }

}
