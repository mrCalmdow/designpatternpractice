package com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Light;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 13:49
 *
 * @Description:
 **/
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
