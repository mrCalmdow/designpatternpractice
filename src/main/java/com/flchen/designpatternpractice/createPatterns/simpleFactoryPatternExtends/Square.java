package com.flchen.designpatternpractice.createPatterns.simpleFactoryPatternExtends;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:16
 **/

@Slf4j
public class Square implements Geometry {
    @Override
    public void draw() {
        log.info("Geometry draw result is: {}", "Square");
    }

    @Override
    public void erase() {
        log.info("Erase geometry: {}", "Square");
    }
}
