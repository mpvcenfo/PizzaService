package com.cenfotec.pizzaservice.builder;

import java.util.ArrayList;

import com.cenfotec.pizzaservice.ingredients.CheeseTypes;
import com.cenfotec.pizzaservice.ingredients.CrustTypes;
import com.cenfotec.pizzaservice.ingredients.ToppingTypes;

public class Pizza {
	private final CrustTypes crust;
	private final ArrayList<CheeseTypes> cheese;
	private final ArrayList<ToppingTypes> toppings;
	private final double cost;
	
	public Pizza(CrustTypes crust, ArrayList<CheeseTypes> cheese, ArrayList<ToppingTypes> toppings, double cost) {
		this.crust = crust;
		this.cheese = cheese;
		this.toppings = toppings;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Pizza [crust=" + crust + ", cheese=" + cheese + ", toppings=" + toppings + ", cost=" + cost + "]";
	}

	public static class PizzaBuilder {
		private CrustTypes nestedCrust;
		private ArrayList<CheeseTypes> nestedCheese;
		private ArrayList<ToppingTypes> nestedToppings;
		private double nestedCost;
		
		public PizzaBuilder(CrustTypes nestedCrust) {
			this.nestedCrust = nestedCrust;
			this.nestedCheese = new ArrayList<CheeseTypes>();
			this.nestedToppings = new ArrayList<ToppingTypes>();
			this.nestedCost = 1000;
		}
		
		public PizzaBuilder crust(CrustTypes crust) {
			this.nestedCrust = crust;
			this.nestedCost = this.nestedCost + 500;
			return this;
		}
		
		public PizzaBuilder cheese(CheeseTypes cheese) {
			this.nestedCheese.add(cheese);
			this.nestedCost = this.nestedCost + 700;
			return this;
		}
		
		public PizzaBuilder toppings(ToppingTypes toppings) {
			this.nestedToppings.add(toppings);
			this.nestedCost = this.nestedCost + 800;
			return this;
		}
		
		public Pizza createPizza() {
			return new Pizza(nestedCrust, nestedCheese, nestedToppings, nestedCost);
		}
	}
}
