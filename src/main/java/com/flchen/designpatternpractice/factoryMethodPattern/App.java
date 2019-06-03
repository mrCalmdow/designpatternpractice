package com.flchen.designpatternpractice.factoryMethodPattern;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 00:29
 **/
public class App {
    public static void main(String[] args) {
        ImageReaderFactory factory = new JpgImageReaderFactory();

        ImageReader reader = factory.createImageReader("hello.jpg");
        reader.readerImage("image base64 content");

        ImageReaderFactory factory1 = XMLUtils.getBean();
        factory1.createImageReader("world.gif").readerImage("wold content");
    }
}
