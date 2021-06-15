//IglooHouseBuilder.java (ConcreteBuilder)
package com.rk.builder;

import com.rk.product.IceBasement;
import com.rk.product.IceCarvingInterior;
import com.rk.product.IceRoof;
import com.rk.product.IceStructor;
import com.rk.product.house.House;


public class IglooHouseBuilder implements IHouseBuilder {
	private House house;
	
	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder.1-param constructor");
		this.house = house;
	}


	public void constructRoof() {
		house.setRoof(new IceRoof());
	}


	public void constructBasement() {
		house.setBasement(new IceBasement());
	}


	public void constructStructor() {
		house.setStructure(new IceStructor());
	}

	public void constructInterior() {
		house.setInterior(new IceCarvingInterior());
	}

	public House getHouse() {
		return house;
	}

}//class
