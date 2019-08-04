package com.flchen.designpatternpractice.compositePattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:05
 *
 * @Description:
 **/
@Slf4j
@Getter
@Setter
@Builder
public class Menu extends MenuComponet {

    List<MenuComponet> items = new ArrayList<>();
    String name;
    String description;

    @Override
    public void add(MenuComponet menuComponet) {
        items.add(menuComponet);
    }

    @Override
    public void remove(MenuComponet menuComponet) {
        items.remove(menuComponet);
    }

    @Override
    public MenuComponet getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public String getDescription() {
        return this.getDescription();
    }

    @Override
    public void print() {
        log.warn("[NAME] --- [{}], [DESCRIPTION] --- [{}]",
                this.name, this.description);

        Iterator<MenuComponet> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public Iterator<MenuComponet> createMenuComponetIterator() {
        return new MenuComponetIterator(items.iterator());
    }
}
