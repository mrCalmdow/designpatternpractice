package com.flchen.designpatternpractice.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:32
 **/

@Slf4j
public class SymbianOperationController implements OperationController {
    @Override
    public void turnLeft() {
        log.info("Operation -- Symbian turn left");
    }

    @Override
    public void turnRight() {
        log.info("Operation -- Symbian turn right");
    }

    @Override
    public void forward(Integer steps) {
        log.info("Operation -- Symbian forward {} steps", steps);
    }

    @Override
    public void retreat(Integer steps) {
        log.info("Operation -- Symbian retreat {} steps", steps);
    }
}
