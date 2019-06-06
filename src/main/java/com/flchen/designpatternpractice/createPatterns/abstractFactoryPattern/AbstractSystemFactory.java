package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:36
 **/
public interface AbstractSystemFactory {

    OperationController createOperationController();

    InterfaceController createInterfaceController();
}
