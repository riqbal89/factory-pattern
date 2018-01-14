package com.rifatiqbal.factory_pattern;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		pizza.finishOrder();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
	// each subclass of a 'product' will implement a specific implementation
}
