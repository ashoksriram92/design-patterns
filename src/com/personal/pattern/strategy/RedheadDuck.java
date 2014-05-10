package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class RedheadDuck extends Duck {
    
    public RedheadDuck() {
        quackBehaviour  =   new Quack();
        flyBehaviour    =   new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("Draws a red headed duck");
    }

}
