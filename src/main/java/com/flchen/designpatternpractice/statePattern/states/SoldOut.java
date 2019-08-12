package com.flchen.designpatternpractice.statePattern.states;

import com.flchen.designpatternpractice.statePattern.Machine;
import com.flchen.designpatternpractice.statePattern.State;
import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:47
 *
 * @Description:
 **/
@Slf4j
public class SoldOut implements State {

    Machine machine;
    public SoldOut(Machine machine) {
        this.machine = machine;
    }

    
    @Override
    public void insertQuarter() {

        log.warn("Please wait to eject gumball.");
    }

    @Override
    public void ejectQuarter() {
        log.warn("Has turn crank, Can't be eject quarter.");
    }

    @Override
    public void turnCrank() {

        log.warn("Has been turn crank.");
    }

    @Override
    public void dispose() {
        log.warn("Please wait gumball.");
    }
}
