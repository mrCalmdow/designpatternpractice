package com.flchen.designpatternpractice.structurePatterns.decoratorPatterns;

/**
 * author fl.chen
 * Date 2019-06-14
 * Time 21:27
 **/
public class ReverseEncryptorDecorator extends AbstractEncryptorDecorator {

    public ReverseEncryptorDecorator(Encryptor encryptor) {
        super(encryptor);
    }

    @Override
    protected String encrypt(String originData) {
        encryptor.encrypt(originData);
        return reverse(originData);
    }

    private String reverse(String originData) {

        int len = originData.length();
        char[] originChars = originData.toCharArray();
        char[] chars = new char[len];

        for(int i = 0; i < len; i++) {
            chars[i] = originChars[len - i -1];
        }
        return String.valueOf(chars);
    }
}
