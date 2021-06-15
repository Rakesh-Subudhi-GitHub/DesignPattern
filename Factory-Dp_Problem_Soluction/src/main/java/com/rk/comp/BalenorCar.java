package com.rk.comp;

public class BalenorCar implements Car {
	
	private CarTyres tyres;
	
	public BalenorCar(CarTyres tyres) {
	System.out.println("BalenorCar:: 1-param costructor");
	this.tyres = tyres;
	}

	public void assemble() {
	System.out.println("Baleno :: car is assembled");	
	}

	public void roadTest() {
	System.out.println("Baleno ::  car is roated Tested");
	}
	
	@Override
	public String toString() {
		return "BalenorCar with [tyres=" + tyres + "]";
	}

}//class

