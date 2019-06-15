package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 16:58
 **/

@Slf4j
public class MySQLDatabaseOperator implements DatabaseOperator {

    @Override
    public DataTransferModule initData() {

        log.info("MySQL operator init data.");
        return new DataTransferModule();
    }
}
