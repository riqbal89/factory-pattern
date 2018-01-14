package com.rifatiqbal.factory_pattern;

public class NyStylePepperoniPizza extends Pizza {

	public NyStylePepperoniPizza() {
		name = "NY Style Sauce and Pepperoni Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
		toppings.add("Pepperoni");
	}

}
