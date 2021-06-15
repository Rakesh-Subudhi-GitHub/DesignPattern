package com.rk.test;

import com.rk.comp.BalenorCar;
import com.rk.comp.Car;
import com.rk.comp.CarTyres;

public class Customer1 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new BalenorCar(tyres);		//set the tyre all are assign it
		car.assemble();
		car.roadTest();
		System.out.println(car);			//all are assemble by own that is the problem

	}//main

}//class

