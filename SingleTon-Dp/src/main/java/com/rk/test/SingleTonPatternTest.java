package com.rk.test;

import com.rk.sdp.Printer;

public class SingleTonPatternTest {

	public static void main(String[] args) {
		
	//Printer p1=new Printer();//it not access bcz all door is close by this class (0-param constructor is private so)
	
		Printer p1= Printer.getInstaceMethod();//Access bcz it static method thats way
		p1.printMsg("Rakesh hello");//so it this way you can access
		
		Printer p2=Printer.getInstaceMethod();
		p2.printMsg("Its 2nd Time calling");   //see this it same time it not create Print(one time it calling)
		
		System.out.println("see the hashcode :: p1 is= "+p1.hashCode() +"  p2= " +p2.hashCode());
		
		System.out.println("same hashcode of p1 or p2 :: "+(p1==p2));
	}//main
}//class
