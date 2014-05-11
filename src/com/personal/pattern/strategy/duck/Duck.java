package com.personal.pattern.strategy.duck;

import com.personal.pattern.strategy.behaviour.FlyBehaviour;
import com.personal.pattern.strategy.behaviour.QuackBehaviour;

/**
 *
 * @author ashoksrirampandian
 */
/*
    Parent class from which children inherit/override behaviour
    Behaviours which can change at runtime are accessed as interfaces
    Design principles in play here:
        1. Favour composition over inheritance
        2. Program to an interface but not to an implementation
        3. Identify aspects of the application that vary and separate them from what stays the same
*/
public abstract class Duck {
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;
    
    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }
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
