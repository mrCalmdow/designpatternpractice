package com.flchen.designpatternpractice.behaviorPatters.observerPattern.customeizedVersion;

public interface Observer {

    void update(Integer temperature, String status);

    void display();
}
