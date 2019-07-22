package com.flchen.designpatternpractice.structurePatterns.decoratorPattern2;

public abstract class Beverage {

    protected String description = "null description";

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    abstract protected Double cost();
}
