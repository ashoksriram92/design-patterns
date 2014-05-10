package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public abstract class Duck {
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;
    
    public void performQuack() {
        quackBehaviour.quack();
    }
    
    public void swim() {
        System.out.println("Swimming");
    }
    
    public void display() {
        System.out.println("Draws a duck");
    }
    
    public void performFly() {
        flyBehaviour.fly();
    }
}
