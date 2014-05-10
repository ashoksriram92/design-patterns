package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class RubberDuck extends Duck{
    
    public RubberDuck() {
        // Notice we are programming to an implementation. 
        // We will fix this later.
        quackBehaviour  =   new Squeak();
        flyBehaviour    =   new FlyNoWay();
    }
      
    public void display() {
        System.out.println("Draws a Rubber duck");
    }

}
