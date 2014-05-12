package com.personal.pattern.factory.creator;

import com.personal.pattern.factory.product.NYCheesePizza;
import com.personal.pattern.factory.product.NYPepperoni;
import com.personal.pattern.factory.product.Pizza;

/**
 *
 * @author ashoksrirampandian
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza (String type) {
        if ( type.equals ("cheese") )
            return new NYCheesePizza ();
        else
            return new NYPepperoni ();
    }

}
