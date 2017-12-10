package com.cenfotec.pizzaservice.example.builder;

import com.cenfotec.pizzaservice.builder.Pizza;
import com.cenfotec.pizzaservice.builder.Pizza.PizzaBuilder;
import com.cenfotec.pizzaservice.ingredients.CheeseTypes;
import com.cenfotec.pizzaservice.ingredients.CrustTypes;
import com.cenfotec.pizzaservice.ingredients.ToppingTypes;

public class BuilderExample {
	public static void main(String[] args) {
		Pizza pizza;
		PizzaBuilder pizzabuilder = new Pizza.PizzaBuilder(CrustTypes.Thick);
		pizzabuilder = pizzabuilder.cheese(CheeseTypes.Parmesan);
		pizzabuilder = pizzabuilder.cheese(CheeseTypes.Mozzarella);
		pizzabuilder = pizzabuilder.toppings(ToppingTypes.BlackOlives);
		pizzabuilder = pizzabuilder.toppings(ToppingTypes.Mushrooms);
		pizzabuilder = pizzabuilder.toppings(ToppingTypes.Pepperoni);

		pizza = pizzabuilder.createPizza();

		System.out.println(pizza);
	}
}
