package com.rk.factory;

import com.rk.comp.DieselEngine;
import com.rk.comp.IEngine;
import com.rk.comp.PetrolEngine;
import com.rk.comp.Vehicle;

//factory pattern
public class VehicleFactory {

	public static Vehicle getIstance(String engineType) {
		
		IEngine engg=null;
		
		if(engineType.equals("diesel"))
		  engg=new DieselEngine();
		
		else if(engineType.equalsIgnoreCase("petrol"))
			engg=new PetrolEngine();
		
		else 
			 throw new IllegalArgumentException("Invalid  engine type");
		
		
	//create target class object
	  Vehicle vehilce=new Vehicle();
		
	//assign Dependent class obj to target class obj 
	  vehilce.setEngg(engg);
		
   //return target class obj
	  return  vehilce;
	
	}//method
	
}//class
