package com.rifatiqbal.factory_pattern;

public class NYPizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String type) {
		
		switch (type) {
		case "cheese":
			return new NyStyleCheesePizza();
		case "veggie":
			return new NyStyleVeggiePizza();
		case "clam":
			return new NyStyleClamPizza();
		case "pepperoni":
			return new NyStylePepperoniPizza();
		default:
			return null;
		}
		
		
//		if (type.equalsIgnoreCase("cheese")) {
//			return new NYStyleCheesePizza();
//		}
	}

}
