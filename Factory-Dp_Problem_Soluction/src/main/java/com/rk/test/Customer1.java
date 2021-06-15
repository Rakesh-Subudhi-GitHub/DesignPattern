package com.rk.test;

import com.rk.comp.Car;
import com.rk.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		
		//simple client only pass the car name then factory all are set or assembled
		Car car1=CarFactory.getCar("baleno");
		System.out.println(car1);
	
	}//main


}//class

