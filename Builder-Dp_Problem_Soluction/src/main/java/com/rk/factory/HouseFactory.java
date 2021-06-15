package com.rk.factory;

import com.rk.builder.ConcreateHouseBuilder;
import com.rk.builder.IHouseBuilder;
import com.rk.builder.IglooHouseBuilder;
import com.rk.builder.MarbleHouseBuilder;
import com.rk.builder.WoodenHouseBuilder;
import com.rk.director.CivilEngineer;
import com.rk.product.house.House;

public class HouseFactory {

	public  static House  getInstance(String  type) {
		
		IHouseBuilder builder=null;
		
		House  house=new House();
		
		if(type.equalsIgnoreCase("wooden")) {
		  builder=new WoodenHouseBuilder(house)	;
		}
		
		else if(type.equalsIgnoreCase("ice")) {
			builder=new IglooHouseBuilder(house);
		}
		
		else if(type.equalsIgnoreCase("concrete")) {
			builder=new ConcreateHouseBuilder(house);
		}
		
		else if(type.equalsIgnoreCase("marble")) {
			builder=new MarbleHouseBuilder(house);
		}
		
		else 
			throw new IllegalArgumentException("Invalid House type");
		
		
		//create Director/Delegator object
		    CivilEngineer engineer=new CivilEngineer(builder);
		    house=engineer.buildHouse();
		    return house;
		
		
	}//class
	
}
