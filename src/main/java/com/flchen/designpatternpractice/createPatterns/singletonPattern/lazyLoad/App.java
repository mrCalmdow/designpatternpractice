package com.flchen.designpatternpractice.createPatterns.singletonPattern.lazyLoad;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 16:40
 **/

@Slf4j
public class App {

    public static void main(String[] args) {
        Service s1 = new Service();
        s1.setCapacity(100);
        s1.setName("s1");
        s1.setStatus(true);

        Service s2 = new Service();
        s2.setName("s2");
        s2.setCapacity(200);
        s2.setStatus(false);

        Service s3 = new Service();
        s3.setName("s3");
        s3.setCapacity(300);
        s3.setStatus(true);

        LoadBalance loadBalance = LoadBalance.getInstance();
        loadBalance.addService(s1);
        loadBalance.addService(s2);
        loadBalance.normalServices().forEach(e -> log.info("service information -- {}", e.toString()));

        log.info("--------------------------");

        LoadBalance loadBalance2 = LoadBalance.getInstance();
//        loadBalance.addService(s1);
        loadBalance.addService(s2);
        loadBalance.addService(s3);
        loadBalance.normalServices().forEach(e -> log.info("service information -- {}", e.toString()));
    }
}
