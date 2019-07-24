package com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 16:21
 *
 * @Description:
 **/
public class Garage {

    private String owner;

    public Garage(String owner) {
        this.owner = owner;
    }

    public void openDoor() {
        System.out.println(owner + ", open door!");
    }

    public void closeDoor() {
        System.out.println(owner + ", close door!");
    }
}
