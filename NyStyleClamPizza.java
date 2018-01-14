package com.rifatiqbal.factory_pattern;

public class NyStyleClamPizza extends Pizza {
	
	public NyStyleClamPizza() {
		name = "NY Style Sauce and Clam Pizza";
		dough = " Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Clams");
		toppings.add("Basil");
		toppings.add("Extra Virgin Olive Oil");
	}

}
