package com.rk.test;

import com.rk.comp.Car;
import com.rk.comp.CarTyres;
import com.rk.comp.SwiftCar;

public class Customer2 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new SwiftCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}//main

}//class

