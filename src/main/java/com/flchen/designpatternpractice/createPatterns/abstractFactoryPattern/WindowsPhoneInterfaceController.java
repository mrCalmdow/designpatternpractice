package com.flchen.designpatternpractice.createPatterns.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 15:43
 **/

@Slf4j
public class WindowsPhoneInterfaceController implements InterfaceController {
    @Override
    public void drawInterface() {
        log.info("Draw interface with Windows Phone style.");
    }
}
