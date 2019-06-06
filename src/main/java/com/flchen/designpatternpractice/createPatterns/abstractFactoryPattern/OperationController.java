package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:19
 **/
public interface OperationController {

    void turnLeft();

    void turnRight();

    void forward(Integer steps);

    void retreat(Integer steps);
}
