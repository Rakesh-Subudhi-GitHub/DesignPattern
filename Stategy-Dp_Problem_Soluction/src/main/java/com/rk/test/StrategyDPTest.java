package com.rk.test;

import com.rk.comp.Vehicle;
import com.rk.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
	  
		//use Factory 
		Vehicle vehicle=VehicleFactory.getIstance("diesel");
		
		vehicle.drive("hyd", "goa");

	}//main

}//class
