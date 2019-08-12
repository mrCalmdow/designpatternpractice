package com.flchen.designpatternpractice.statePattern.states;

import com.flchen.designpatternpractice.statePattern.Machine;
import com.flchen.designpatternpractice.statePattern.State;
import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:41
 *
 * @Description:
 **/
@Slf4j
public class HasQuarter implements State {

    Machine machine;
    public HasQuarter(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {


    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        this.dispose();
    }

    @Override
    public void dispose() {
        if (machine.getCount() > 0) {
            machine.setCount(machine.getCount() - 1);
            log.warn("Gumball out!");
            if (machine.getCount() >= 0) {
                machine.setState(machine.getSoldOut());
            }
        } else {
            log.error("Sold out! no more gumball!");
        }
    }
}
