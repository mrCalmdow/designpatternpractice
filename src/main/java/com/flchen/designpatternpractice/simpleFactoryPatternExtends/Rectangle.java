package com.flchen.designpatternpractice.simpleFactoryPatternExtends;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:10
 **/

@Slf4j
public class Rectangle implements Geometry {
    @Override
    public void draw() {
        log.info("Geometry draw result is: {}", "Rectangle");
    }

    @Override
    public void erase() {
        log.info("Erase geometry: {}", "Rectangle");
    }
}
