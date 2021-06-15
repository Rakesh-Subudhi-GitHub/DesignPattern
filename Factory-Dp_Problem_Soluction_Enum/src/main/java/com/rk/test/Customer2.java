package com.rk.test;

import com.rk.comp.Car;
import com.rk.factory.CarFactory;
import com.rk.factory.CarType;

public class Customer2 {

	public static void main(String[] args) {

		CarType type=null;//enum
		
		Car car1=CarFactory.getCar(type.ERTIGA);
		System.out.println(car1);

	}

}//class

