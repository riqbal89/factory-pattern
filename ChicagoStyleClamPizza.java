package com.rifatiqbal.factory_pattern;

public class ChicagoStyleClamPizza extends Pizza {
	
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Sauce and Clam Pizza";
		dough = " Thin Crust Dough";
		sauce = "Tomato Sauce";
		
		toppings.add("Clams");
		toppings.add("Basil");
		toppings.add("Extra Virgin Olive Oil");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
