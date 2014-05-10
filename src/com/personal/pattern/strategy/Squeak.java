package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }


}
