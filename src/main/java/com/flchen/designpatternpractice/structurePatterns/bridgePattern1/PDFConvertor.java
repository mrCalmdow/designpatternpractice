package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 16:54
 **/

@Slf4j
public class PDFConvertor extends Convertor {

    @Override
    public void convert(DataTransferModule dataTransferModule) {
        log.info("PDF convertor to convert : {}", dataTransferModule);
    }
}
