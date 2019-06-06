package com.flchen.designpatternpractice.createPatterns.singletonPattern.lazyLoad;

import lombok.Data;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 16:37
 **/
@Data
public class Service {

    private String name;

    private Integer capacity;

    private Boolean status;
}
