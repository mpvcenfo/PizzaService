package com.cenfotec.pizzaservice.decorator.extras;

import com.cenfotec.pizzaservice.decorator.Food;

public abstract class PizzaDecorator extends Food {
	@Override
	public abstract String getName();
}
