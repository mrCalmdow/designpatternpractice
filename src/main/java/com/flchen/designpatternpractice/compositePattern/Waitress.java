package com.flchen.designpatternpractice.compositePattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:25
 *
 * @Description:
 **/
@Slf4j
public class Waitress {

    MenuComponet allMenu;

    public Waitress(MenuComponet allMenu) {
        this.allMenu = allMenu;
    }

    public void print() {
        allMenu.print();
    }

    public void printVegetarians() {
        Iterator<MenuComponet> iterator = allMenu.createMenuComponetIterator();
        while(iterator.hasNext()) {
            MenuComponet next = iterator.next();
            try {
                if (next.isVegetarian()) {
                    next.print();
                }
            } catch (Exception e) {
                log.error("not support isVegetarian.");
            }
        }
    }
}
