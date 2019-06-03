package com.flchen.designpatternpractice.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:37
 **/
public class AndroidSystemFactory implements AbstractSystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
