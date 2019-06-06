package com.flchen.designpatternpractice.structurePatterns.bridgePattern;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 15:53
 **/
public class Client {

    public static void main(String[] args) {

        Image image = new GifImage("hello", "hello,world!");
        Implemention implemention = new WindowsImplemention(image);
        implemention.doPrint();

        Image image1 = new JpgImage("hi", "hi, men!");
        Implemention implemention1 = new WindowsImplemention(image1);
        implemention1.doPrint();
    }
}
