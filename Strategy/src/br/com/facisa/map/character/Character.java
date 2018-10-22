package br.com.facisa.map.character;

import br.com.facisa.map.weapon.WeaponStrategy;

public class Character {

	private WeaponStrategy weapon;
	
	
	public String fight() {
		return null;
	}


	public WeaponStrategy getWeapon() {
		return weapon;
	}


	public void setWeapon(WeaponStrategy w) {
		this.weapon = w;
	}
}
