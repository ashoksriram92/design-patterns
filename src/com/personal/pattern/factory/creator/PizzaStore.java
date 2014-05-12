package com.personal.pattern.factory.creator;

import com.personal.pattern.factory.product.Pizza;

/**
 *
 * @author ashoksrirampandian
 */
public abstract class PizzaStore {

    public void orderPizza (String type) {
        Pizza p = this.createPizza (type);
        p.prepareDough();
        p.addCheese();
        p.addSpice();
        p.bake();
        p.pack();
        p.deliver();
    }

    public abstract Pizza createPizza(String type);
    

}
