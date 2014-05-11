package com.personal.pattern.strategy.duck;

import com.personal.pattern.strategy.behaviour.Quack;
import com.personal.pattern.strategy.behaviour.FlyWithWings;

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
