package com.flchen.designpatternpractice.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:38
 **/
public class SymbianSystemFactory implements AbstractSystemFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbainInterfaceController();
    }
}
