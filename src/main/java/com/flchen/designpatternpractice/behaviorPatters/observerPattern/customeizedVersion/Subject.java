package com.flchen.designpatternpractice.behaviorPatters.observerPattern.customeizedVersion;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notification();
}
