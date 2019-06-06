package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:42
 **/


public class DatabaseOperationAdapter implements DatabaseOperation {

    private Encryptor encryptor;

    public DatabaseOperationAdapter(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    @Override
    public void saveCryptograph(String cryptogram) {

    }

    @Override
    public String getCryptogram(String origin) {
        return encryptor.encryptor(origin);
    }
}
