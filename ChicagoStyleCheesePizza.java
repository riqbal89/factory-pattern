package com.rifatiqbal.factory_pattern;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = " Thin Crust Dough";
		sauce = "Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
