package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class Duck {
    public void quack() {
        System.out.println("Quack");
    }
    
    public void swim() {
        System.out.println("Swimming");
    }
    
    public void display() {
        System.out.println("Draws a duck");
    }
    
    public void fly() {
        System.out.println("Duck is flying!");
    }
}
