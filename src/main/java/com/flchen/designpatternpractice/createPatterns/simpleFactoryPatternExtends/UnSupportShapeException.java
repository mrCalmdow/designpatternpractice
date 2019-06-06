package com.flchen.designpatternpractice.createPatterns.simpleFactoryPatternExtends;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:43
 **/
public class UnSupportShapeException extends Exception {

    public UnSupportShapeException(String message) {
        super(message);
    }
}
