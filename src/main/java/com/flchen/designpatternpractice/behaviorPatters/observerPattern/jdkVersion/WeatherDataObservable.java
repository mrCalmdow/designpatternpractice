package com.flchen.designpatternpractice.behaviorPatters.observerPattern.jdkVersion;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Data
@Slf4j
public class WeatherDataObservable extends Observable {

    private Integer data;

    public WeatherDataObservable(Integer data) {
        this.data = data;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    @Override
    public synchronized int countObservers() {
        return super.countObservers();
    }

    /**
     * 触发更新
     * @param data
     */
    public void updateData(Integer data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }

}
