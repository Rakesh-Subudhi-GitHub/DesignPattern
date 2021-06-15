////MarbleHouseBuilder.java (ConcreateBuilder)
package com.rk.builder;

import com.rk.product.ConcreteBasement;
import com.rk.product.ConcreteRoof;
import com.rk.product.IronStructor;
import com.rk.product.MixedInterior;
import com.rk.product.house.House;

public class MarbleHouseBuilder implements IHouseBuilder {
	private House house;
	
	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder.1-param constructor()");
		this.house = house;
	}

	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	public void constructStructor() {
		house.setStructure(new IronStructor());
	}

	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	public House getHouse() {
		return house;
	}

}//class
