package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Base64;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:46
 **/

@Slf4j
public class Base64Encryptor implements Encryptor {

    @Override
    public String encryptor(String origin) {
        byte[] bytes = origin.getBytes();
        log.info("Simulating Base64 encryption.");
        return Base64.getEncoder().encodeToString(bytes);
    }
}
