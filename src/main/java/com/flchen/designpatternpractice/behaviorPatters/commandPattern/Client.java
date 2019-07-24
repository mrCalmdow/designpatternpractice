package com.flchen.designpatternpractice.behaviorPatters.commandPattern;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond.GarageOpenDoorCommand;
import com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond.LightOnCommand;
import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Garage;
import com.flchen.designpatternpractice.behaviorPatters.commandPattern.receivers.Light;

public class Client {

    public static void main(String[] args) {

        SimpleRemoteController remoteController = new SimpleRemoteController();


        LightOnCommand commander = new LightOnCommand(new Light("Bedroom light"));
        remoteController.setCommand(commander);
        remoteController.buttonPressed();

        LightOnCommand commander1 = new LightOnCommand(new Light("Drawing room light"));
        remoteController.setCommand(commander1);
        remoteController.buttonPressed();
        remoteController.undoButtonPressed();

        GarageOpenDoorCommand commander2 = new GarageOpenDoorCommand(new Garage("flchen"));
        remoteController.setCommand(commander2);
        remoteController.buttonPressed();
        remoteController.undoButtonPressed();
    }
}
