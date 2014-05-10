package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour  =   new Quack();
        flyBehaviour    =   new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("Draws a Mallard Duck");
    }
}
