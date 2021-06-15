//ConcreateHouseBuilder.java (ConcreateBuilder)
package com.rk.builder;

import com.rk.product.ConcreteBasement;
import com.rk.product.ConcreteRoof;
import com.rk.product.ConcreteStructor;
import com.rk.product.GlassInterior;
import com.rk.product.house.House;

public class ConcreateHouseBuilder implements IHouseBuilder {
	private House house;
	
	public ConcreateHouseBuilder(House house) {
		System.out.println("ConcreateBuilder.1-param constructor");
		this.house = house;
	}

	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	public void constructStructor() {
		house.setStructure(new ConcreteStructor());
	}

	public void constructInterior() {
		house.setInterior(new GlassInterior());
	}

	public House getHouse() {
		return house;
	}

}//class
