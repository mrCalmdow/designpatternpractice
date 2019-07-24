package com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Light;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 13:49
 *
 * @Description:
 **/
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
