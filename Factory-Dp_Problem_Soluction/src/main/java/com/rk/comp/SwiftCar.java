package com.rk.comp;

public class SwiftCar implements Car {

	private CarTyres tyres;
	
	public SwiftCar(CarTyres tyres) {
		System.out.println("SwiftCar.1-param cosntructor");
		this.tyres = tyres;
	}
	
	public void assemble() {
		
		System.out.println("SwiftCar :: car is assembled");
	}

	public void roadTest() {
		
		System.out.println("SwiftCar ::  car is roated Tested");
		
	}

	@Override
	public String toString() {
		return "SwiftCar [tyres=" + tyres + "]";
	}

}//class