package com.rk.test;

import com.rk.comp.BajajBike;
import com.rk.factory.BajajNoidaFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike=BajajNoidaFactory.createBike("pulsor");
		bike.drive();
		
		System.out.println("Oreder of assigning in NorthFactory is :: ");
		
		/*output is :: 
		 * Assembling Bajaj Bike
				Painting Bajaj Bike
					Oliling of Bajaj Bike
						Driving Bajaj Pulsor Bike*/
	}//main

}//class
