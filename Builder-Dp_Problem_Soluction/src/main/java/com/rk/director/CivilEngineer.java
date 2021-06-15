package com.rk.director;

import com.rk.builder.IHouseBuilder;
import com.rk.product.house.House;

public class CivilEngineer {
	private IHouseBuilder builder;
	
	public  CivilEngineer(IHouseBuilder builder) {
		System.out.println("CivilEngineer:: 1- param constructor");
		this.builder=builder;
	}
	
	//builder design pattern main method :: Defining process to construct the complext obj
	public   House  buildHouse() {
		builder.constructBasement();
		builder.constructStructor();
		builder.constructRoof();
		builder.constructInterior();
		House house=builder.getHouse(); 
		return house;
	}

}
