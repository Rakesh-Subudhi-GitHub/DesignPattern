//NorthCustomer.java
package com.rk.test;

import com.rk.comp.BajajBike;
import com.rk.factory.BajajBikeFactory;
import com.rk.factory.BajajBikeFactoryLocator;


public class NorthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory=BajajBikeFactoryLocator.buildBikeFactory("noida");
		BajajBike bike=factory.orderBike("pulsor");
		bike.drive();
	}

}
