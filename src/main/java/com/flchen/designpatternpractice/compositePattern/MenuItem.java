package com.flchen.designpatternpractice.compositePattern;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:06
 *
 * @Description:
 **/
@Slf4j
@Getter
@Setter
@Builder
public class MenuItem extends MenuComponet {

    String name;
    String description;
    boolean isVegetarian;
    double price;

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    @Override
    public void print() {
        log.warn("[NAME] --- [{}], [DESCRIPTION] --- [{}], [VEGETARIAN] --- [{}]", this.name, this.description, this.isVegetarian);
    }

    @Override
    public Iterator<MenuComponet> createMenuComponetIterator() {
        return new NullIterator();
    }
}
