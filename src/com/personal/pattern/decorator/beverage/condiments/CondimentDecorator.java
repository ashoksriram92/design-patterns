package com.personal.pattern.decorator.beverage.condiments;

import com.personal.pattern.decorator.beverage.Beverage;

/**
 * Condiment Decorator extends Beverage. So it inherits all the properties of Beverage
 * like description and cost
 * 
 * We can add new condiments by extending this abstract class. 
 * 
 * The only difference between the decorator and a concrete beverage is that, the decorator
 * requires a concrete beverage.
 * 
 * Thereby we are extending functionality by composition
 * 
 * @author ashoksrirampandian
 */

public abstract class CondimentDecorator extends Beverage {
    private Beverage b;

    public Beverage getBeverage() {
        return b;
    }

    public void setBeverage(Beverage b) {
        this.b = b;
    }
    
    public void getDescription() {
        System.out.println("Ukknown condiment");
    }
    
    public abstract double getCost();
}
