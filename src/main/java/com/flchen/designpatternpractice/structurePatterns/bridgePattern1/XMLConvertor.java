package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 16:55
 **/

@Slf4j
public class XMLConvertor extends Convertor {
    @Override
    public void convert(DataTransferModule dataTransferModule) {
        DataTransferModule dtModule = databaseOperator.initData();
        log.info("XML convertor to convert : {}", dataTransferModule);
    }
}
