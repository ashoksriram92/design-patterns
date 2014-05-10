package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class RubberDuck extends Duck{
    public void quack() {
        System.out.println("Squeak!");
    }
    
    public void display() {
        System.out.println("Draws a Rubber duck");
    }

}
