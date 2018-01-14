package com.rifatiqbal.factory_pattern;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String type) {
		
		/**
		 * always have evaluation statement in lowercase and 
		 * then strip the case off the input "type"
		 * should then always match.
		 */

		switch (type) {
		case "cheese":
			return new ChicagoStyleCheesePizza();
		case "veggie":
			return new ChicagoStyleVeggiePizza();
		case "clam":
			return new ChicagoStyleClamPizza();
		case "pepperoni":
			return new ChicagoStylePepperoniPizza();
		default:
			return null;
		}
	}

}
