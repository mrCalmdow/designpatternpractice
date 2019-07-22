package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DarkRoast extends Beverage {

    @Override
    protected Double cost() {
        log.info("[Cost] -- darkRoast coffee cost money.");
        return 2.0;
    }
}
