package com.flchen.designpatternpractice.singletonPattern.initialLoad;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 17:03
 **/
public class LoadBalance {

    private static final LoadBalance loadBalance = new LoadBalance();

    private LoadBalance() {

    }

    public static LoadBalance getInstance() {
        return loadBalance;
    }
}
