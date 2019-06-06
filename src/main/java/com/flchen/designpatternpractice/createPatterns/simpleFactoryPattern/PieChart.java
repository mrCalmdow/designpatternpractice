package com.flchen.designpatternpractice.createPatterns.simpleFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-05-31
 * Time 16:10
 **/
@Slf4j
public class PieChart implements Chart {
    @Override
    public void display() {
        log.info("Display pie chart~");
    }
}
