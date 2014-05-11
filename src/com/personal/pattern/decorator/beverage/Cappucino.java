package com.personal.pattern.decorator.beverage;

/**
 *
 * @author ashoksrirampandian
 */
/*
    Concrete Beverage
*/
public class Cappucino extends Beverage {
    public void getDescription() {
        System.out.println("Cappucino");
    }
    
    public double getCost() {
        return 2.5;
    }
}
