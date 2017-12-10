package com.cenfotec.pizzaservice.decorator;

import java.util.ArrayList;

import com.cenfotec.pizzaservice.ingredients.CheeseTypes;
import com.cenfotec.pizzaservice.ingredients.CrustTypes;
import com.cenfotec.pizzaservice.ingredients.ToppingTypes;

public class Pizza extends Food {
	public Pizza() {
		this.name = "Pizza";
	}
	
	public double cost() {
		return 1000.0;
	}
}
