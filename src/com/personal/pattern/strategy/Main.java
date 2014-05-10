package com.personal.pattern.strategy;

/**
 *
 * @author ashoksrirampandian
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }
}
