package com.rifatiqbal.factory_pattern;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		ArrayList<String> orders = new ArrayList<>();

		orders.add("cheese");
		orders.add("veggie");
		orders.add("clam");
		orders.add("pepperoni");

		PizzaStore newYorkPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		for (String order : orders) {
			newYorkPizzaStore.orderPizza(order);
			chicagoPizzaStore.orderPizza(order);
		}
	}

}
