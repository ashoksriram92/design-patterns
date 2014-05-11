package com.personal.pattern.strategy.behaviour;

/**
 *
 * @author ashoksrirampandian
 */
public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    

}
