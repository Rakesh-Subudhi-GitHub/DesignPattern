package com.rk.test;

import com.rk.comp.IShape;
import com.rk.factory.ShapeFactory;

public class FlyWeightProblemTest {

	public static void main(String[] args) {
		
		for(int i=1;i<=500;++i) {
		    IShape shape =ShapeFactory.getShape("circle");
		    System.out.println(shape.hashCode());
		    shape.draw(i+10, "red","dotted");
		}
		
		System.out.println("==========================");
		
		for(int i=1;i<=500;++i) {
		    IShape shape =ShapeFactory.getShape("square");
		    System.out.println(shape.hashCode());
		    shape.draw(i+10, "red","dotted");
		}
		
	}//main
	
}//class
