package com.cenfotec.pizzaservice.decorator.extras;

import com.cenfotec.pizzaservice.decorator.Food;

public class Mozarella extends PizzaDecorator {
	private Food food;
	
	public Mozarella(Food food) {
		this.food = food;
	}
	
	@Override
	public String getName() {
		return this.name + "with mozarella cheese";
	}
	
	@Override
	public double cost() {
		return 500.0 + this.food.cost();
	}
}
