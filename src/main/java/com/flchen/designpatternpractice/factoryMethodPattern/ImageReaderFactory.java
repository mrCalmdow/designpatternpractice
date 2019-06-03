package com.flchen.designpatternpractice.factoryMethodPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:30
 **/
public interface ImageReaderFactory {

    ImageReader createImageReader(String imageName);
}
