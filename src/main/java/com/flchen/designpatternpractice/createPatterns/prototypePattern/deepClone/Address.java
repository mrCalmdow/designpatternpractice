package com.flchen.designpatternpractice.createPatterns.prototypePattern.deepClone;

import lombok.Data;

import java.io.Serializable;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 20:15
 **/

@Data
public class Address implements Serializable {

    private String cityName;

    private String detailAddress;

    private String phoneNum;

}
