package com.rk.factory;

import com.rk.comp.BalenorCar;
import com.rk.comp.Car;
import com.rk.comp.CarTyres;
import com.rk.comp.ErtigaCar;
import com.rk.comp.SwiftCar;

public class CarFactory {
	
	//static factory method
	public static  Car getCar(CarType type) {
    Car car=null;
	
    //create CarTyres object
	CarTyres tyres=new CarTyres();
											//client enter the carname then 
												//accordingly factory all assign the car needed
	if(type == type.BALENO) {
	  	car=new BalenorCar(tyres);
	 }
	
	else if(type == type.SWIFT) {
	car=new SwiftCar(tyres);
	}
	
	else if(type == type.ERTIGA) {
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
