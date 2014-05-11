package com.personal.pattern.decorator.beverage;

/**
 *
 * @author ashoksrirampandian
 */
public abstract class Beverage {
    public void getDescription() {
        System.out.println("Unknown Beverage");
    }
    
    /**
     * Returns cost of a Beverage
     * @return
     */
    public abstract double getCost();
}
