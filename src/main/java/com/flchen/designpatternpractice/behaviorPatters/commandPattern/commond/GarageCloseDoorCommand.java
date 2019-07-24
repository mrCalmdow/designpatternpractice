package com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Garage;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 16:24
 *
 * @Description:
 **/
public class GarageCloseDoorCommand implements Command {

    Garage garage;

    public GarageCloseDoorCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.closeDoor();
    }

    @Override
    public void undo() {

    }
}
