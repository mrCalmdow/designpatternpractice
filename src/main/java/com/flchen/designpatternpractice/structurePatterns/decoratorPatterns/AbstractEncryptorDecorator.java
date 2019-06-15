package com.flchen.designpatternpractice.structurePatterns.decoratorPatterns;

/**
 * author fl.chen
 * Date 2019-06-14
 * Time 21:24
 **/
public abstract class AbstractEncryptorDecorator extends Encryptor {

    protected Encryptor encryptor;

    public AbstractEncryptorDecorator() {

    }

    public AbstractEncryptorDecorator(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    abstract protected String encrypt(String originData);
}
