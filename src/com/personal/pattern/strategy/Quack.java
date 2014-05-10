package com.personal.pattern.strategy;

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
