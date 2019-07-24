package com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Garage;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 16:24
 *
 * @Description:
 **/
public class GarageOpenDoorCommand implements Command {

    Garage garage;

    public GarageOpenDoorCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.openDoor();
    }

    @Override
    public void undo() {
        garage.closeDoor();
    }
}
