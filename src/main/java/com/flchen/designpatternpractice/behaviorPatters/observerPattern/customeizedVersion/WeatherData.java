package com.flchen.designpatternpractice.behaviorPatters.observerPattern.customeizedVersion;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private Integer temperature;

    private String status;

    public WeatherData(Integer temperature, String status) {

        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public void addObserver(Observer observer) {

        if(observers.contains(observer)) {
            log.info("[addObserver] -- observer exist.");
            return ;
        }
        observers.add(observer);
        log.info("[addObserver] -- observer add succeed.");
    }

    @Override
    public void deleteObserver(Observer observer) {

        if(observers.contains(observer)) {
            observers.remove(observer);
            log.info("[addObserver] -- observer removed.");
        }

        log.info("[addObserver] -- observer not exist.");
    }

    @Override
    public void notification() {

        observers.forEach(e -> {
            e.update(this.temperature, this.status);
        });
    }

    public void updateData(Integer temperature, String status) {

        this.temperature = temperature;
        this.status = status;

        notification();
    }

}
