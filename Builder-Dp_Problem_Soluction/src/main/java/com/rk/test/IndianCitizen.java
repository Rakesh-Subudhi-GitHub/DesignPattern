package com.rk.test;

import com.rk.factory.HouseFactory;
import com.rk.product.house.House;

public class IndianCitizen {
	
	public static void main(String[] args) {
	
		House house=HouseFactory.getInstance("concrete");
		
		System.out.println(house);
		
	}//main

}//class
