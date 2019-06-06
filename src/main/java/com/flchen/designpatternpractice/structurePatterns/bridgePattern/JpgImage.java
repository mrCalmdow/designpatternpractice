package com.flchen.designpatternpractice.structurePatterns.bridgePattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 15:39
 **/

@Slf4j
@Data
public class JpgImage extends Image {

    public JpgImage(String name, String content) {
        this.name = name;
        this.content = content;
        this.suffix = "jpg";
    }

    @Override
    public Matrix parseToMatrix() {
        Matrix matrix = new Matrix();
        matrix.setContent("Matrix: " + name + "." + suffix + " --> " + content);
        log.info("JPG image parse to matrix.");
        return matrix;
    }
}
