package com.rk.test;

import com.rk.factory.HouseFactory;
import com.rk.product.house.House;

public class IceLandCitizen {
	
	public static void main(String[] args) {
	
		House house=HouseFactory.getInstance("ice");
		
		System.out.println(house);
		
	}//main

}//class
