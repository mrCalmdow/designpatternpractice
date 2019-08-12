package com.flchen.designpatternpractice.statePattern.states;

import com.flchen.designpatternpractice.statePattern.Machine;
import com.flchen.designpatternpractice.statePattern.State;
import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:43
 *
 * @Description:
 **/
@Slf4j
public class NoQuarter implements State {

    Machine machine;
    public NoQuarter(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        this.machine.setState(new HasQuarter(this.machine));
        log.warn("Has insert quarter.");
    }

    @Override
    public void ejectQuarter() {

        log.warn("You have not insert quarter, Can't be eject.");
    }

    @Override
    public void turnCrank() {

        log.warn("You have not insert quarter.");
    }

    @Override
    public void dispose() {

        log.error("You have not insert quarter.");
    }
}
