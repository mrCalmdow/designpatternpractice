package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 17:04
 **/

@Slf4j
public class OracleDatabaseOperator implements DatabaseOperator {

    @Override
    public DataTransferModule initData() {
        log.info("Oracle operator init data.");
        return new DataTransferModule();
    }
}
