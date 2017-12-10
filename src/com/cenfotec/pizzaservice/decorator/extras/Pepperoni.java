package com.cenfotec.pizzaservice.decorator.extras;

import com.cenfotec.pizzaservice.decorator.Food;

public class Pepperoni extends PizzaDecorator {
	private Food food;
	
	public Pepperoni(Food food) {
		this.food = food;
	}
	
	@Override
	public String getName() {
		return this.name + "with pepperoni";
	}
	
	@Override
	public double cost() {
		return 1300.0 + this.food.cost();
	}
}
