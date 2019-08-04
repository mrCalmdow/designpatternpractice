package com.flchen.designpatternpractice.compositePattern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:26
 *
 * @Description:
 **/
@Slf4j
public class Client {

    public static void main(String[] args) {

        MenuItem item1 = MenuItem.builder().
                name("pizza").description("first pizza").isVegetarian(false).price(1.1).build();

        MenuItem item2 = MenuItem.builder().
                name("pizza2").description("second pizza").isVegetarian(true).price(1.2).build();

        MenuItem item3 = MenuItem.builder().
                name("pizza3").description("third pizza").isVegetarian(true).price(1.3).build();

        MenuItem item4 = MenuItem.builder().
                name("pizza4").description("fourth pizza").isVegetarian(true).price(1.4).build();

        Menu menu1 = Menu.builder().name("menu1").description("menu1 description").items(new ArrayList<>()).build();
        menu1.add(item1);
        menu1.add(item2);

        Menu menu2 = Menu.builder().name("menu2").description("menu2 description").items(new ArrayList<>()).build();
        menu2.add(item3);
        menu2.add(item4);

        Menu allMenu = Menu.builder().name("allMenu").description("allMenu description").items(new ArrayList<>()).build();
        allMenu.add(menu1);
        allMenu.add(menu2);

        Waitress waitress = new Waitress(allMenu);
        waitress.print();
        log.info("--------------------------");
        waitress.printVegetarians();
    }
}
