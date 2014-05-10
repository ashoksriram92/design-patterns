package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class MuteDuck implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Cannot quack!");
    }
    

}
