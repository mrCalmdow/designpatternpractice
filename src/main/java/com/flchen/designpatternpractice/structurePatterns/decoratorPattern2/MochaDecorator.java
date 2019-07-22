package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

public class MochaDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha.";
    }

    @Override
    protected Double cost() {
        Double beverageCost = beverage.cost();
        return 0.3 + beverageCost;
    }
}
