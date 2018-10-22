package br.com.facisa.map.weapon;

public enum WeaponBehavior implements WeaponStrategy  {
	
	KnifeBehavior{

		@Override
		public String useWeapon() {
			return ("Utilizar uma Faca");
		}},
	BowAndArrowBehavior{

		@Override
		public String useWeapon() {
			return ("Utilizar Arco e Flecha");
		}},
	AxeBehavior{

		@Override
		public String useWeapon() {
			return ("Cortar Com um Machado");
		}},
	SwordBehavior{

		@Override
		public String useWeapon() {
			return ("Utilizar uma Espada");
		}}
	
	
	

}
