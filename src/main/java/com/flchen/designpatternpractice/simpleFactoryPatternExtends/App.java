package com.flchen.designpatternpractice.simpleFactoryPatternExtends;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 17:51
 **/
public class App {

    public static void main(String[] args) throws UnSupportShapeException {
        Geometry geometry = GeometriesFactory.createGeometry("triangle");
        geometry.draw();
        geometry.erase();

        Geometry square = GeometriesFactory.createGeometry("square");
        square.draw();
        square.erase();

//        Geometry circle = GeometriesFactory.createGeometry("circle");
//        circle.draw();
//        circle.erase();

        Geometry shape = GeometriesFactory.createGeometry(XMLUtils.getShapeType());
        shape.draw();
    }
}
