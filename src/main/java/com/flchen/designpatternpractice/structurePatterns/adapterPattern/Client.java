package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:51
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {
        DatabaseOperation dop = new DatabaseOperationAdapter(new Base64Encryptor());
        String cryptogram = dop.getCryptogram("Hello");
        log.info("Cryptogram information: {}", cryptogram);
    }
}
