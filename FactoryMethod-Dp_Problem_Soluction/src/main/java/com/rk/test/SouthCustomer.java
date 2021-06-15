//SouthCustomer .java
package com.rk.test;

import com.rk.comp.BajajBike;
import com.rk.factory.BajajBikeFactory;
import com.rk.factory.BajajBikeFactoryLocator;
public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory=BajajBikeFactoryLocator.buildBikeFactory("chennai");
		BajajBike bike=factory.orderBike("pulsor");
		bike.drive();

	}

}
