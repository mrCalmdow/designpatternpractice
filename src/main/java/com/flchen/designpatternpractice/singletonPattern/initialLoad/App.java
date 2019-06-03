package com.flchen.designpatternpractice.singletonPattern.initialLoad;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 17:06
 **/

@Slf4j
public class App {

    public static void main(String[] args) {
        LoadBalance loadBalance1 = LoadBalance.getInstance();
        LoadBalance loadBalance2 = LoadBalance.getInstance();

        if(loadBalance1.equals(loadBalance2)) {
            log.info("loadBalance1 equals loadBalance2~");
        }
    }
}
