package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

import lombok.extern.slf4j.Slf4j;
import sun.security.provider.MD5;
import sun.security.rsa.RSASignature;

import java.util.Base64;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:26
 * old class need to use
 **/
public interface Encryptor {

    public String encryptor(String origin);
}
