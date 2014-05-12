package com.personal.pattern.factory.product;

/**
 * This is actually an opportunity for Decorator pattern as well. But not using it for the sake of 
 * simplicity
 * 
 * We could've made a concrete Pizza class with all the additional like adding cheese and spices as 
 * decorators
 * 
 * @author ashoksrirampandian
 */
public class Pizza {

    public void prepareDough() {
        System.out.println("Preparing Dough...");
    }

    public void addCheese() {
        System.out.println("Unknown Operation");
    }

    public void addSpice() {
        System.out.println("Unknown Operation");
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void pack() {
        System.out.println("Packing...");
    }

    public void deliver() {
        System.out.println("Sending for delivery...");
    }
    
    public void addPepperoni () {
        System.out.println("Unknown Operation");
    }
}
