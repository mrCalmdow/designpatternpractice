package com.flchen.designpatternpractice.structurePatterns.bridgePattern1;

/**
 * author fl.chen
 * Date 2019-06-06
 * Time 17:07
 **/
public class Client {

    public static void main(String[] args) {
        Convertor pdfConvertor = new PDFConvertor();
        DatabaseOperator mySQLDatabaseOperator = new MySQLDatabaseOperator();

        pdfConvertor.setDatabaseOperator(mySQLDatabaseOperator);
        pdfConvertor.doConvertData();


        Convertor xmlConvertor = new XMLConvertor();
        DatabaseOperator oracleDatabaseOperator = new OracleDatabaseOperator();
        xmlConvertor.setDatabaseOperator(oracleDatabaseOperator);
        xmlConvertor.doConvertData();
    }
}
