package com.rk.factory;

import com.rk.comp.BajajBike;
import com.rk.comp.BajajDiscover;
import com.rk.comp.BajajPlatina;
import com.rk.comp.BajajPulsor;

public class BajajChennaiFactory {

	//factory method
    public   static  BajajBike  createBike(String type) {
	
    	BajajBike bike=null;
		
    	if(type.equalsIgnoreCase("discover"))
			bike=new BajajDiscover();
		
    	else if(type.equalsIgnoreCase("platina"))
		   	bike=new BajajPlatina();
		
    	else if(type.equalsIgnoreCase("pulsor"))
		   	bike=new BajajPulsor();
		
    	else 
		 	 throw new IllegalArgumentException("Invalid Bike type");
			    
		
    	//order of assigning in ChennaiFactory
		  paint();
		  assemble();
		  oiling();
		  roadTest();
		
	return bike;
    
 }	
		 
		 
	 public static  void  paint() {
		 System.out.println("Painting Bajaj Bike");
	 }

	 public static void  assemble() {
		 System.out.println("Assembling Bajaj Bike");
	 }
	 
	 public static void roadTest() {
		 System.out.println("RoadTeting of Bajaj Bike");
	 }
	 
	 public static void oiling() {
		 System.out.println("Oliling of Bajaj Bike");
	 }
	 
	 
}
