package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

public class MilkDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    protected Double cost() {
        Double beverageCost = beverage.cost();
        return 0.2 + beverageCost;
    }
}
