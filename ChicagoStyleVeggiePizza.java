package com.rifatiqbal.factory_pattern;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Sauce and Veggie Pizza";
		dough = " Thick Crust Dough";
		sauce = "Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Mushrooms");
		toppings.add("Onions");
		toppings.add("Peppers");
		toppings.add("Sweetcorn");
		toppings.add("Extra HOT Chilli Peppers!!");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
