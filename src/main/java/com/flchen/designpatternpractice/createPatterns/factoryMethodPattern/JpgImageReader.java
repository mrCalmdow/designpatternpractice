package com.flchen.designpatternpractice.createPatterns.factoryMethodPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:33
 **/

@Slf4j
public class JpgImageReader implements ImageReader {

    private String imageName;

    public JpgImageReader(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public void readerImage(String imageBase64Data) {
        log.info("{} -- Reader JPG images", this.imageName);
    }
}
