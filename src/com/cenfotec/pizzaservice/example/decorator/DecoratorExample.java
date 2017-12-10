package com.cenfotec.pizzaservice.example.decorator;

import com.cenfotec.pizzaservice.decorator.Pizza;
import com.cenfotec.pizzaservice.decorator.extras.Mozarella;
import com.cenfotec.pizzaservice.decorator.extras.Pepperoni;
import com.cenfotec.pizzaservice.decorator.extras.ThinCrust;
import com.cenfotec.pizzaservice.ingredients.CrustTypes;

public class DecoratorExample {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		ThinCrust thinCrustPizza = new ThinCrust(pizza);
		Mozarella mozarellaPizza = new Mozarella(thinCrustPizza);
		Pepperoni pepperoniPizza = new Pepperoni(mozarellaPizza);
		
		System.out.println("We have: " + thinCrustPizza.getName() + " at " + thinCrustPizza.cost());
		System.out.println("We have: " + mozarellaPizza.getName() + " at " + mozarellaPizza.cost());
		System.out.println("We have: " + pepperoniPizza.getName() + " at " + pepperoniPizza.cost());
	}
}
