package com.flchen.designpatternpractice.structurePatterns.bridgePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 15:49
 **/

@Slf4j
public class WindowsImplemention implements Implemention {

    private Image image;

    public WindowsImplemention(Image image) {
        this.image = image;
    }

    @Override
    public void doPrint() {

        Matrix matrix = image.parseToMatrix();
        log.info("Matrix print -- > {}", matrix.getContent());
    }
}
