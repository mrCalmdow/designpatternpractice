package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class StarBuzzCoffee {


    public static void main(String[] args) throws IOException {
        Beverage espresso = new Espresso();
        espresso.setDescription("espresso");

        CondimentDecorator milkDecorator = new MilkDecorator(espresso);
        log.info("[milk] ----- {}", milkDecorator.cost());

        CondimentDecorator mocha = new MochaDecorator(milkDecorator);
        mocha.cost();
        log.info("[mocha] ----- {}", mocha.cost());


        InputStream in = new LowerCaseInputStream(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("config.xml").getFile()));
        int c;
//        byte[] b = new byte[10];
        while ((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
        in.close();
    }



}
