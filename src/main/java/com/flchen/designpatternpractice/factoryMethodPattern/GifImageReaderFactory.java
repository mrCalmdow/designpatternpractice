package com.flchen.designpatternpractice.factoryMethodPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:34
 **/
public class GifImageReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader(String imageName) {
        return new GifImageReader(imageName);
    }
}
