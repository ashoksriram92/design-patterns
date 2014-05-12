package com.personal.pattern.factory.product;

/**
 *
 * @author ashoksrirampandian
 */
public class ChicagoPepperoni extends Pizza {
    public void addSpice () {
        System.out.println("Adding Chicago Spices...");
    }
    
    public void addPepperoni () {
        System.out.println("Adding Chicago Pepperoni...");
    }

}
