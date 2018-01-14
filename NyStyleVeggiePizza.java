package com.rifatiqbal.factory_pattern;

public class NyStyleVeggiePizza extends Pizza {
	
	public NyStyleVeggiePizza() {
		name = "NY Style Sauce and Veggie Pizza";
		dough = " Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Mushrooms");
		toppings.add("Onions");
		toppings.add("Peppers");
		toppings.add("Sweetcorn");
		toppings.add("Extra HOT Chilli Peppers!!");
	}

}
