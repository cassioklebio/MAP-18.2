package br.com.facisa.character;

import br.com.facisa.weapon.WeaponBehavior;

public class Character {
	
	private WeaponBehavior weapon;
	Character character;
	
	
	public Character(Character character) {
		this.character = character;
		
	}


	public WeaponBehavior getWeapon() {
		return weapon;
	}


	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	
	
	

}
