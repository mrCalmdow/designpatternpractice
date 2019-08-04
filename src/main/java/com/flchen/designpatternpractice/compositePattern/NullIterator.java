package com.flchen.designpatternpractice.compositePattern;

import java.util.Iterator;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:58
 *
 * @Description:
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
