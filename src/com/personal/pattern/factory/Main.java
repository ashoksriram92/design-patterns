package com.personal.pattern.factory;

import com.personal.pattern.factory.creator.NYPizzaStore;
import com.personal.pattern.factory.creator.PizzaStore;

/**
 *
 * Factory Pattern
 * This pattern defines an interface for creating an object, but lets subclasses 
 * decide which class to instantiate. Factory Method lets a class defer instantiation 
 * to subclasses
 * 
 * This method has a creator (PizzaStore) and product (Pizza) parent classes
 * Instantiation of Pizza is deferred to subclasses of PizzaStore (NYPizzaStore 
 * creates NYCheesePizzas
 * 
 * This is done by having an abstract createMethod() in creator which is expected 
 * of the subclasses to be instantiated. 
 * 
 * @author ashoksrirampandian
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new NYPizzaStore();
        ps.orderPizza ("pepperoni");
    }
}
