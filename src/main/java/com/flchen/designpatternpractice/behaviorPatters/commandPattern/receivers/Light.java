package com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 13:50
 *
 * @Description:
 **/
public class Light {

    private String name;
    private String status;

    public Light(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void turnOn() {
        this.status = "on";
        System.out.println(name + ", Light turn on!");
    }

    public void turnOff() {
        this.status = "off";
        System.out.println(name + ", Light turn off!");
    }
}
