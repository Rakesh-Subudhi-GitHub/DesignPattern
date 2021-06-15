package com.rk.factory;

import com.rk.comp.BalenorCar;
import com.rk.comp.Car;
import com.rk.comp.CarTyres;
import com.rk.comp.ErtigaCar;
import com.rk.comp.SwiftCar;

public class CarFactory {
	
	//static factory method
	public static  Car getCar(String type) {
    Car car=null;
	
    //create CarTyres object
	CarTyres tyres=new CarTyres();
											//client enter the carname then 
												//accordingly factory all assign the car needed
	if(type.equalsIgnoreCase("baleno")) {
	  	car=new BalenorCar(tyres);
	 }
	
	else if(type.equalsIgnoreCase("swift")) {
	car=new SwiftCar(tyres);
	}
	
	else if(type.equalsIgnoreCase("ertiga")) {
	car=new ErtigaCar(tyres);
	}
	
	else {
	throw  new IllegalArgumentException("invalid car type");
	}
	
	car.assemble();    //car assemble car type wise

	car.roadTest();   //car type wise it decided
	
	return car;
		
	}//method
}//class
