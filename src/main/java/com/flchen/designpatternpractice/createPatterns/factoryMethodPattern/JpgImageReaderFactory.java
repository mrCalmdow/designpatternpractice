package com.flchen.designpatternpractice.createPatterns.factoryMethodPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:34
 **/
public class JpgImageReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader(String imageName) {
        return new JpgImageReader(imageName);
    }
}
