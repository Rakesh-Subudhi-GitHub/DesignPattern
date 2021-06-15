package com.rk.sdp;

public class Printer {

	private static volatile Printer InstanceVariable;
	
	//private Constructor its not access this class indirectly
	private Printer()
	{
		System.out.println("0-param constroctor calling in private access");
	}
	
	//one door it open and access by only for this
	public static Printer getInstaceMethod()   
	{	
		if(InstanceVariable == null) {   //1st Null check
		
		synchronized (Printer.class) {       //Synchronized Block
			if(InstanceVariable == null)	//2nd Null check
				InstanceVariable =new Printer();	
		}
	}	
		return InstanceVariable;
	
	}//method
	
	//b.logic
	public void printMsg(String msg)
	{
		System.out.println("Msg print by printMethod :: "+msg);
	}
	
}//class
