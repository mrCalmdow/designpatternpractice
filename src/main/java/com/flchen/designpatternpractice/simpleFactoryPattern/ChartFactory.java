package com.flchen.designpatternpractice.simpleFactoryPattern;

/**
 * author fl.chen
 * Date 2019-05-31
 * Time 16:07
 **/
public class ChartFactory {

    public static Chart createHistogramChart() {
        return new HistogramChart();
    }

    public static Chart createPieChart() {
        return new PieChart();
    }
}
