package com.flchen.designpatternpractice.createPatterns.singletonPattern.IoDH;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 17:04
 **/
public class LoadBalance {

    private LoadBalance() {

    }

    private static class LoadBalanceHolder {
        private final static LoadBalance loadBalance = new LoadBalance();
    }

    public static LoadBalance getInstance() {
        return LoadBalanceHolder.loadBalance;
    }
}
