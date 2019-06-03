package com.flchen.designpatternpractice.singletonPattern.IoDH;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 17:28
 **/

@Slf4j
public class App {

    public static void main(String[] args) {
        LoadBalance balance1 = LoadBalance.getInstance();
        LoadBalance balance2 = LoadBalance.getInstance();

        if (balance1.equals(balance2)) {
            log.info("balance1 equals balance2 ~");
        }
    }
}
