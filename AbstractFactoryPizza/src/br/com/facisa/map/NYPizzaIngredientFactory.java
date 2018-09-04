package br.com.facisa.map;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	
	public Dough createDough() {
		
		return new thickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new PlumTomateDough()  ;
	}

	@Override
	public Cheese createCheese() {
		
		return new Mozzarells();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { 
				new BlackOlives(),
                new Spinach(),
                new Eggplant() };
       return veggies;
}
	
	

	@Override
	public Pepperoni createPepperoni() {
		
		return null ;
	}

	@Override
	public Clams createClam() {
		
		return new FrozamClams();
	}
	
		

}
