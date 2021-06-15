package com.rk.test;

import com.rk.comp.Car;
import com.rk.factory.CarFactory;
import com.rk.factory.CarType;

public class Customer1 {

	public static void main(String[] args) {
		
		//simple client only pass the car name then factory all are set or assembled
		CarType type=null;  //enum
		Car car1=CarFactory.getCar(type.BALENO);
		System.out.println(car1);
	
	}//main


}//class

