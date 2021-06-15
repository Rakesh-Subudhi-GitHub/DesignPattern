package com.rk.factory;

import com.rk.comp.Circle;
import com.rk.comp.IShape;
import com.rk.comp.Square;

public class ShapeFactory {
	
	public static  IShape  getShape(String type) {
		
	 IShape shape=null;
	
	 if(type.equalsIgnoreCase("square"))
	   shape=new Square();
		
	 else if(type.equalsIgnoreCase("circle"))
	   shape=new Circle();
		
	 else 
	   throw new IllegalArgumentException("Invalid Shape type");
		            
		 return  shape;
	}
	
}//class
