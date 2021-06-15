package com.rk.sdp;

public class Printer {
	
	//private Constructor its not access this class indirectly
	private Printer()
	{
		System.out.println("0-param constroctor calling in private access");
	}
	
	//innner class of Printer class
	private static class InnerPrinter{
		private static volatile Printer InstanceVariable =new Printer(); //eager loading
	}
	
	//factory method 
	public static Printer getInstaceMethod() {
		return InnerPrinter.InstanceVariable; //call inner class and return the (InstanceVariable) simple 
	}
	
}//class
