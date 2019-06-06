package com.flchen.designpatternpractice.structurePatterns.bridgePattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 15:33
 **/
@Slf4j
@Data
public abstract class Image {

    protected String suffix;

    protected String name;

    protected String content;

    public Image() {
        log.info("Image construct run~");
    }

    protected abstract Matrix parseToMatrix();
}
