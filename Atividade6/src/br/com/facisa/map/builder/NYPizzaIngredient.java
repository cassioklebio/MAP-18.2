package br.com.facisa.map.builder;

public class NYPizzaIngredient implements PizzaIngredientBuilder {

	@Override
	public Dough createDough() {
		
		return new thickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomateDough();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarells();
	}

	@Override
	public Veggies[] createVeggies() {
		
		return null;
	}

	@Override
	public Pepperoni createPepperroni() {
		return null;
	}

	@Override
	public Clams createClam() {
		return new FrozamClams();
	}

	public NYPizzaIngredient getPizza() {
		return getPizza();
	}

}
