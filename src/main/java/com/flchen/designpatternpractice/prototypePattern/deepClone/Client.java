package com.flchen.designpatternpractice.prototypePattern.deepClone;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 20:29
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {

        Address address = new Address();
        address.setCityName("changsha");
        address.setDetailAddress("moon bay");
        address.setPhoneNum("18662256725");

        Customer customer = new Customer();
        customer.setName("flchen");
        customer.setAge(18);
        customer.setAddresses(address);

        log.info("customer -- {}", customer.toString());

        Customer customer1 = customer.clone();
        log.info("customer1 -- {}", customer1.toString());

        Customer customer2 = customer.deepClone();
        log.info("customer2 -- {}", customer2.toString());

    }
}
