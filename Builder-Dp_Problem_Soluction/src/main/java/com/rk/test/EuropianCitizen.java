package com.rk.test;

import com.rk.factory.HouseFactory;
import com.rk.product.house.House;

public class EuropianCitizen {
	
	public static void main(String[] args) {
	
		House house=HouseFactory.getInstance("wooden");
		
		System.out.println(house);
		
	}//main

}//class
