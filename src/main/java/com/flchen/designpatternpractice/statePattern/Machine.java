package com.flchen.designpatternpractice.statePattern;

import com.flchen.designpatternpractice.statePattern.states.HasQuarter;
import com.flchen.designpatternpractice.statePattern.states.NoQuarter;
import com.flchen.designpatternpractice.statePattern.states.Sold;
import com.flchen.designpatternpractice.statePattern.states.SoldOut;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:42
 *
 * @Description:
 **/
@Slf4j
@Getter
@Setter
public class Machine {

    private State state;

    HasQuarter hasQuarter = new HasQuarter(this);
    NoQuarter noQuarter = new NoQuarter(this);
    Sold sold = new Sold(this);
    SoldOut soldOut = new SoldOut(this);
    private int count;

    public Machine(int count) {
        this.state = soldOut;
        this.count = count;
        if (count > 0) {
            this.state = noQuarter;
        }
    }


    public void insertQuarter() {
        this.setState(hasQuarter);
        log.info("Has quarter.");
    }

    public void turnCrank() {
        if (this.state == hasQuarter) {
            this.state.turnCrank();
            log.info("turn crank.");
        } else {
            log.error("No quarter, can't turn crank.");
        }
    }

    public int machineCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Machine machine = new Machine(100);

        for (int i = 0; i <= 200; i++) {
            log.info("[start]----Machine gumball num: [{}]", machine.machineCount());
            machine.turnCrank();
            machine.insertQuarter();
            machine.turnCrank();
            log.info("[end]----Machine gumball num: [{}]", machine.machineCount());
        }
    }

}
