package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:16
 **/
public class App {

    public static void main(String[] args) {
        AbstractSystemFactory factory = new AndroidSystemFactory();
        OperationController operationController = factory.createOperationController();
        InterfaceController interfaceController = factory.createInterfaceController();

        interfaceController.drawInterface();
        operationController.turnLeft();
        operationController.forward(10);

        factory = new WindowsPhoneSystemFactory();
        OperationController windowsPhoneOperationController = factory.createOperationController();
        InterfaceController windowsPhoneInterfaceController = factory.createInterfaceController();
        windowsPhoneInterfaceController.drawInterface();
        windowsPhoneOperationController.forward(555);
    }
}
