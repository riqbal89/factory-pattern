package com.rifatiqbal.factory_pattern;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	protected void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for (String topping : toppings) {
			System.out.println("    " + topping);
		}
	}
	
	protected void bake() {
		System.out.println("Bake for 25 minutes at 350f");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	protected void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	protected final void finishOrder() {
		System.out.println("Order Complete... Enjoy! \n");
	}
	
	public String getName() {
		return name;
	}
}