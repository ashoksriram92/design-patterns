package com.personal.pattern.factory.creator;

import com.personal.pattern.factory.product.ChicagoCheesePizza;
import com.personal.pattern.factory.product.ChicagoPepperoni;
import com.personal.pattern.factory.product.Pizza;

/**
 *
 * @author ashoksrirampandian
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza (String type) {
        if ( type.equals("cheese") )
            return new ChicagoCheesePizza ();
        else
            return new ChicagoPepperoni ();
    }

}
