package com.rk.test;

import com.rk.comp.BajajBike;
import com.rk.factory.BajajChennaiFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		
		BajajBike bike=BajajChennaiFactory.createBike("pulsor");
		
		System.out.println("Order of assiging in SouthFactory Style is :: ");
		bike.drive();

		/* output is::
		 * Painting Bajaj Bike
				Assembling Bajaj Bike
					Oliling of Bajaj Bike
						RoadTeting of Bajaj Bike
							Driving Bajaj Pulsor Bike*/
	}//main

}//class
