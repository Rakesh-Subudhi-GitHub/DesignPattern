package com.rk.test;

import com.rk.comp.Car;
import com.rk.factory.CarFactory;

public class Customer2 {

	public static void main(String[] args) {

		Car car1=CarFactory.getCar("ertiga");
		System.out.println(car1);

	}

}//class

