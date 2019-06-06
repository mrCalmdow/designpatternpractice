package com.flchen.designpatternpractice.structurePatterns.bridgePattern;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 15:36
 **/

@Slf4j
@Data
public class GifImage extends Image {

    public GifImage(String name, String content) {
        this.name = name;
        this.content = content;
        this.suffix = "gif";
    }

    @Override
    public Matrix parseToMatrix() {
        Matrix matrix = new Matrix();
        matrix.setContent("Matrix: " + name + "." + suffix + " --> " + content);
        log.info("GIF image parse to matrix.");
        return matrix;
    }
}
