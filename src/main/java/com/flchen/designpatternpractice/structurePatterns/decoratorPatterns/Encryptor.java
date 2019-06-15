package com.flchen.designpatternpractice.structurePatterns.decoratorPatterns;

/**
 * author fl.chen
 * Date 2019-06-14
 * Time 21:15
 **/
public abstract class Encryptor {

    abstract protected String encrypt(String originData);
}
