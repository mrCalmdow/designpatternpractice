package com.flchen.designpatternpractice.compositePattern;

import java.util.Iterator;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:01
 *
 * @Description:
 **/
public abstract class MenuComponet {

    public void add(MenuComponet menuComponet) {
        throw new UnsupportedOperationException("unsupported!");
    }

    public void remove(MenuComponet menuComponet) {
        throw new UnsupportedOperationException("unsupported!");
    }

    public MenuComponet getChild(int i) {
        throw new UnsupportedOperationException("unsupported!");
    }


    public String getName() {
        throw new UnsupportedOperationException("unsupported!");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("unsupported!");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("unsupported!");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("unsupported!");
    }

    public void print() {
        throw new UnsupportedOperationException("unsupported!");
    }

    public Iterator<MenuComponet> createMenuComponetIterator() {
        throw new UnsupportedOperationException("unsupported!");
    }

}
