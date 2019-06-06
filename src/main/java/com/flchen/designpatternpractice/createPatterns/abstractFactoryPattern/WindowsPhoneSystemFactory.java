package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:45
 **/
public class WindowsPhoneSystemFactory implements AbstractSystemFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsPhoneOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsPhoneInterfaceController();
    }
}
