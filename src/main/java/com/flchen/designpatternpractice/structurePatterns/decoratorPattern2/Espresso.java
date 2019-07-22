package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Espresso extends Beverage {

    @Override
    protected Double cost() {
        log.info("[Cost] -- espresso coffee cost money.");
        return 1.0;
    }
}
