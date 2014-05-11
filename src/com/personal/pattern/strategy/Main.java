package com.personal.pattern.strategy;

import com.personal.pattern.strategy.duck.Duck;
import com.personal.pattern.strategy.duck.ModelDuck;
import com.personal.pattern.strategy.behaviour.FlyWithWings;

/**
 *
 * @author ashoksrirampandian
 */
public class Main {
    public static void main(String[] args) {
        // The Strategy Pattern
        // defines a family of algorithms, encapsulates each one, and 
        // makes them interchangeable. Strategy lets the algorithm vary 
        // independently from clients that use it.

        Duck d = new ModelDuck();
        //Model duck cannot fly initially
        d.performFly();
        d.setFlyBehaviour(new FlyWithWings());
        d.performFly();
    }
}
