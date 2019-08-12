package com.flchen.designpatternpractice.statePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:22
 *
 * @Description:
 **/
@Slf4j
public class EasyVersionGumballMachine {

    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public EasyVersionGumballMachine(int count) {
        this.count = count;
        if (0 < count) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if(state == NO_QUARTER) {
            this.state = HAS_QUARTER;
            log.warn("Has insert quarter");
        } else if(state == HAS_QUARTER) {
            log.warn("Already insert quarter, you can't insert another quarters.");
        } else  if(state == SOLD_OUT) {
            this.state = SOLD_OUT;
            log.warn("Has sold_out, will eject your quarter.");
        } else if(state == SOLD) {
            log.warn("Please wait. we are already give you a gumball.");
        }
    }

    public void ejectQuarter() {
        if(state == HAS_QUARTER) {
            this.state = NO_QUARTER;
            log.warn("Eject quarter.");
        } else if(state == NO_QUARTER) {
            log.warn("Have no quarter to eject.");
        } else if(state == SOLD) {
            log.warn("We're already give you a gumball, can't to eject quarter.");
        } else if(state == SOLD_OUT) {
            log.warn("The machine has sold out, you may not be insert quarter.");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            this.state = SOLD;
            log.warn("Ok, Please wait a while. We'll eject a gumball for you.");
            dispose();
        } else if(state == NO_QUARTER) {
            log.warn("Sorry, you have not insert quarter.");
            this.state = NO_QUARTER;
        } else if(state == SOLD) {
            log.warn("You has been turned the crank, Please no more turn.");
        } else if(state == SOLD_OUT) {
            log.warn("Machine's gumballs has sold out.");
            this.state = SOLD_OUT;
        }
    }

    private void dispose() {

        if (count > 0) {
            log.warn("Dispose gumball.");
            this.state = NO_QUARTER;
            count = count - 1;
        } else if(count <= 0) {
            log.warn("Machine is sold out.");
            this.state = SOLD_OUT;
        }
    }

    public static void main(String[] args) {
        EasyVersionGumballMachine machine = new EasyVersionGumballMachine(10);

        machine.insertQuarter();
        machine.turnCrank();

        machine.turnCrank();

    }
}
