package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:31
 **/

@Slf4j
public class AndroidOperationController implements OperationController {
    @Override
    public void turnLeft() {
        log.info("Operation -- Android turn left");
    }

    @Override
    public void turnRight() {
        log.info("Operation -- Android turn right");
    }

    @Override
    public void forward(Integer steps) {
        log.info("Operation -- Android forward {} steps", steps);
    }

    @Override
    public void retreat(Integer steps) {
        log.info("Operation -- Android retreat {} steps", steps);
    }
}
