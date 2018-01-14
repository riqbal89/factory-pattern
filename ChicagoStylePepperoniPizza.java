package com.rifatiqbal.factory_pattern;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Sauce and Pepperoni Pizza";
		dough = "Thick Crust Dough";
		sauce = "Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Pepperoni");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
