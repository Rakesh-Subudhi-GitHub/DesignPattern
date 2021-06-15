package com.rk.sdp;

import java.io.Serializable;

public class Printer implements Serializable {

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
		
	//b.logic
	public void printMsg(String msg)
	{
		System.out.println("Msg print by printMethod :: "+msg);
	}
	
}//class
