package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:41
 **/

@Slf4j
public class WindowsPhoneOperationController implements OperationController {
    @Override
    public void turnLeft() {
        log.info("Operation -- Windows Phone turn left");
    }

    @Override
    public void turnRight() {
        log.info("Operation -- Windows Phone turn right");
    }

    @Override
    public void forward(Integer steps) {
        log.info("Operation -- Windows Phone forward {} steps", steps);
    }

    @Override
    public void retreat(Integer steps) {
        log.info("Operation -- Windows Phone retreat {} steps", steps);
    }
}
