package com.personal.pattern.decorator.beverage.condiments;

import com.personal.pattern.decorator.beverage.Beverage;

/**
 *
 * @author ashoksrirampandian
 */
public class Mocha extends CondimentDecorator {
    
    public Mocha( Beverage b) {
        super.setBeverage(b);
    }
    
    public void getDescription() {
        System.out.println("Mocha");
    }
    
    @Override
    public double getCost() {
        return super.getBeverage().getCost() + 0.5;
    }
    
}
