package com.cenfotec.pizzaservice.decorator.extras;

import com.cenfotec.pizzaservice.decorator.Food;

public class ThinCrust extends PizzaDecorator {
	private Food food;
	
	public ThinCrust(Food food) {
		this.food = food;
	}
	
	@Override
	public String getName() {
		return this.name + "with thin crust";
	}
	
	@Override
	public double cost() {
		return 400.0 + this.food.cost();
	}
}