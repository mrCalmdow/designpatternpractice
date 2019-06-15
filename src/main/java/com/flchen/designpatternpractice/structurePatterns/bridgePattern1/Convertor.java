package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 16:51
 **/

@Slf4j
public abstract class Convertor {

    protected DatabaseOperator databaseOperator;

    protected void setDatabaseOperator(DatabaseOperator databaseOperator) {
        this.databaseOperator = databaseOperator;
    }

    abstract void convert(DataTransferModule dataTransferModule);

    protected void beforeInitData() {
        log.info("Default before init data");
    }
    protected void afterInitData() {
        log.info("Default before init data");
    }

    protected void beforeConvert() {
        log.info("Default before init data");
    }
    protected void afterConvert() {
        log.info("Default before init data");
    }

    protected void doConvertData() {

        beforeInitData();
        DataTransferModule dataTransferModule = databaseOperator.initData();
        afterInitData();

        beforeConvert();
        convert(dataTransferModule);
        afterConvert();
    }
}
