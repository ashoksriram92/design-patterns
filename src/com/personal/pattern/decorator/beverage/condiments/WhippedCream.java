package com.personal.pattern.decorator.beverage.condiments;

import com.personal.pattern.decorator.beverage.Beverage;

/**
 *
 * @author ashoksrirampandian
 */
public class WhippedCream extends CondimentDecorator {

    public WhippedCream( Beverage b) {
        super.setBeverage(b);
    }
    
    public void getDescription() {
        System.out.println("Whipped Cream");
    }
    
    @Override
    public double getCost() {
        return super.getBeverage().getCost() + 1.0;
    }

}
