package com.flchen.designpatternpractice.structurePatterns.adapterPattern;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 14:18
 **/
public interface DatabaseOperation {

    void saveCryptograph(String cryptogram);

    String getCryptogram(String origin);
}
