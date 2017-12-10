package com.cenfotec.pizzaservice.decorator;

public abstract class Food {
	public String name = "none";
	
	public String getName() {
		return name;
	}
	
	public abstract double cost();
}
