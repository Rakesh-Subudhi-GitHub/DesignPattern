package com.rk.test;

import com.rk.sdp.Printer;

public class SingletonCloneTest {

	public static void main(String[] args) {
		
		//normal singleton calling
		Printer p1= Printer.getInstaceMethod();
		
		//do cloning on object
		try {
			Printer p2=(Printer)p1.clone();
			System.out.println("Cloned object is created");
			System.out.println(p1.hashCode()+"  "+p2.hashCode()); //bcz it clone so new address is allocated so
			System.out.println("p1==p2?"+(p1==p2));
		}
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
