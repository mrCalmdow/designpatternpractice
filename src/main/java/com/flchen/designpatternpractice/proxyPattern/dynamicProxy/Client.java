package com.flchen.designpatternpractice.proxyPattern.dynamicProxy;

import lombok.extern.slf4j.Slf4j;

/**
 * author: flchen
 * Date: 2019-08-18
 * Time: 22:12
 *
 * @Description:
 **/
@Slf4j
public class Client {

    public static void main(String[] args) {
        PersonBean tom = new PersonBeanImpl();
        tom.setGender("M");
        tom.setName("Tom");

        PersonBean tomProxy = CustomerProxyFactory.getOwnPersonBeanProxy(tom);
        tomProxy.setInterests("Swimming");
        log.info("Tom's nickName: [{}]", tomProxy.getName());

        try {
            tomProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            log.error("SetHotOrNotRating error.");
        }


        PersonBean roseProxy = CustomerProxyFactory.getNotOwnPersonBeanProxy(tom);
        roseProxy.setHotOrNotRating(8);
        String interests = roseProxy.getInterests();
        log.info("Tom's interests: [{}]", interests);

        int hotOrNotRating = tomProxy.getHotOrNotRating();
        log.info("Tom check himself's hotOrNotRating: [{}]", hotOrNotRating);
    }
}
