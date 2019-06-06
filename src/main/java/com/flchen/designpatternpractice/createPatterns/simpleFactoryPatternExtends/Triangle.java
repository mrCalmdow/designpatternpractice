package com.flchen.designpatternpractice.createPatterns.simpleFactoryPatternExtends;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:26
 **/

@Slf4j
public class Triangle implements Geometry {
    @Override
    public void draw() {
        log.info("Geometry draw result is: {}", "Triangle");
    }

    @Override
    public void erase() {
        log.info("Erase geometry: {}", "Triangle");
    }
}
