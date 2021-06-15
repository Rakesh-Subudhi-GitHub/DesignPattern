//WoodenHouseBuilder.java (ConcreteBuilder)
package com.rk.builder;

import com.rk.product.WoodenBasement;
import com.rk.product.WoodenInterior;
import com.rk.product.WoodenRoof;
import com.rk.product.WoodenStructor;
import com.rk.product.house.House;

public class WoodenHouseBuilder implements IHouseBuilder {
	private House house;
	
	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder.1-param constructor");
		this.house = house;
	}

	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	public void constructBasement() {
		house.setBasement(new WoodenBasement());
	}

	public void constructStructor() {
		house.setStructure(new WoodenStructor());
	}

	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	public House getHouse() {
		return house;
	}

}//class
