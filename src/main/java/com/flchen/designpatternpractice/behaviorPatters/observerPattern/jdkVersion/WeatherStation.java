package com.flchen.designpatternpractice.behaviorPatters.observerPattern.jdkVersion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeatherStation {

    public static void main(String[] args) {
        WeatherDataObservable observable = new WeatherDataObservable(1);

        CurrentStationObserver observer = new CurrentStationObserver(observable);

        observer.subscribe();
        observer.display();

        observable.updateData(2);
//        observer.display();

        observer.unsubscribe();
        observable.updateData(3);

        observer.display();
    }
}
