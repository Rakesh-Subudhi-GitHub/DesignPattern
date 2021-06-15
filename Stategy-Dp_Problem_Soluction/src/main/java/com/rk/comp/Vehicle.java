//Vehicle.java (target class) 
package com.rk.comp;

public final class Vehicle {
  
	private IEngine  engg;  //HAS- A property (Composition)
  
	//constructor
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}//constructor

	//setter injection attached with Engine
	public void setEngg(IEngine engg) {
		
		System.out.println("Vehicle.setEngg(-)");
		this.engg = engg;
		
	}//setter

	
 public void drive(String sourcePlace,String destPlace) {
	
	 System.out.println("Vehicle.drive()");
	 engg.start();
	 
	 System.out.println("Vehicle:: Driving started at"+sourcePlace);
	 System.out.println("Vehicle:: Driving is go on ......");
	 
	 engg.stop();
	 System.out.println("Vehicle:: Driving ended  at"+destPlace);
 
 }//method

}//class
