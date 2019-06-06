package com.flchen.designpatternpractice.createPatterns.simpleFactoryPattern;

/**
 * author fl.chen
 * Date 2019-05-31
 * Time 16:12
 **/
public class App {

    public static void main(String[] args) {
        Chart chart = ChartFactory.createHistogramChart();

        chart.display();

        chart = ChartFactory.createPieChart();
        chart.display();
    }
}
