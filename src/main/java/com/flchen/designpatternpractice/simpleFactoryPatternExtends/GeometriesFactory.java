package com.flchen.designpatternpractice.simpleFactoryPatternExtends;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:28
 **/

@Slf4j
public class GeometriesFactory {

    public static Geometry createGeometry(String typeName) throws UnSupportShapeException {
        switch (typeName) {
            case "triangle":
                return createTriangle();
            case "rectangle":
                return createRectangle();
            case "square":
                return createSquare();
            default:
                throw new UnSupportShapeException(typeName + " not support");
        }
    }

    public static Geometry createTriangle() {
        return new Triangle();
    }

    public static Geometry createRectangle() {
        return new Rectangle();
    }

    public static Geometry createSquare() {
        return new Square();
    }
}
