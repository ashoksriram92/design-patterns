package com.personal.pattern.strategy.duck;

import com.personal.pattern.strategy.behaviour.Quack;
import com.personal.pattern.strategy.behaviour.FlyNoWay;

/**
 *
 * @author ashoksrirampandian
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("Draws a model duck");
    }

}
