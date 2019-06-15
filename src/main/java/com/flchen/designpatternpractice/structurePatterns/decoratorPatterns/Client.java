package com.flchen.designpatternpractice.structurePatterns.decoratorPatterns;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-14
 * Time 21:20
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {
        Encryptor encryptor = new MovePositionEncryptor();

        log.info("result ------ {}", encryptor.encrypt("ab"));
        log.info("result ------ {}", encryptor.encrypt("abc"));
        log.info("result ------ {}", encryptor.encrypt("abcde"));

        Encryptor reverse = new ReverseEncryptorDecorator(encryptor);

        log.info("result ------ {}", reverse.encrypt("ab"));
        log.info("result ------ {}", reverse.encrypt("abc"));
        log.info("result ------ {}", reverse.encrypt("abcde"));
    }
}
