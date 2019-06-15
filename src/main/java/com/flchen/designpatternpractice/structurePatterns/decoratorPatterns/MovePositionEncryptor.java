package com.flchen.designpatternpractice.structurePatterns.decoratorPatterns;

/**
 * author fl.chen
 * Date 2019-06-14
 * Time 21:17
 **/
public class MovePositionEncryptor extends Encryptor {


    @Override
    public String encrypt(String originData) {
        int len = originData.length();
        if (2 < len) {
            return originData.substring(2, len) + originData.substring(0, 2);
        }
        return originData;
    }
}
