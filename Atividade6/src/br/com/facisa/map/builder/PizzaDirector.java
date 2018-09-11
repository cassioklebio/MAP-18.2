package br.com.facisa.map.builder;

public class PizzaDirector {
	protected NYPizzaIngredient pizza;
	
	public PizzaDirector(NYPizzaIngredient pizza) {
		this.pizza = pizza;
	}
	
	public void constroirPizza() {
		pizza.createCheese();
		pizza.createClam();
		pizza.createDough();
		pizza.createPepperroni();
	}
	
	public NYPizzaIngredient getPizza() {
		return pizza.getPizza();
	}
}
