package com.flchen.designpatternpractice.createPatterns.factoryMethodPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:32
 **/

@Slf4j
public class GifImageReader implements ImageReader {

    private String imageName;

    public GifImageReader(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public void readerImage(String imageBase64Data) {
        log.info("{} -- Reader GIF images", this.imageName);
    }
}
