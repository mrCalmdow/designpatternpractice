package com.flchen.designpatternpractice.behaviorPatters.commandPattern;

import com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond.Command;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 14:00
 *
 * @Description:
 **/
public class SimpleRemoteController {

    private Command commander;

    private Command undoCommander;

    public void setCommand(Command commander) {
        this.commander = commander;
    }

    public void buttonPressed() {
        this.commander.execute();
        this.undoCommander = this.commander;
    }

    public void undoButtonPressed() {
        this.undoCommander.undo();
    }
}
