package com.flchen.designpatternpractice.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:31
 **/

@Slf4j
public class AndroidInterfaceController implements InterfaceController {
    @Override
    public void drawInterface() {
        log.info("Draw interface with Android style.");
    }
}
