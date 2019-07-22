package com.flchen.designpatternpractice.behaviorPatters.observerPattern.jdkVersion;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Data
@Slf4j
public class CurrentStationObserver implements Observer {

    private Observable observable;

    private Integer data;

    public CurrentStationObserver(Observable observable) {
        this.observable = observable;
    }

    public void subscribe() {
        this.observable.addObserver(this);
    }

    public void unsubscribe() {
        this.observable.deleteObserver(this);
        log.info("[unsubscribe]");
    }

    @Override
    public void update(Observable o, Object arg) {

        this.data = (Integer) arg;
        display();
    }

    public void display() {
        log.info("[Display] -- data = {}", data);
    }
}
