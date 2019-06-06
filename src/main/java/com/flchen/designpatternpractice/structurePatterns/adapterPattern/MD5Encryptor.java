package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:48
 **/

@Slf4j
public class MD5Encryptor implements Encryptor {
    @Override
    public String encryptor(String origin)  {

        log.info("Simulating MD5 encryption.");
        return "MD5:" + origin;
    }
}
