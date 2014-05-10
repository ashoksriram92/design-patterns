package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
    

}
