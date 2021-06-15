package com.rk.sdp;


public class Printer {

	private static Printer InstanceVariable;
	
	//private Constructor its not access this class indirectly
	private Printer()
	{
		System.out.println("0-param constroctor calling in private access");
	}
	
	//one door it open and access by only for this
	public static Printer getInstaceMethod()
	{
		if(InstanceVariable == null)
		InstanceVariable =new Printer();	
		
		return InstanceVariable;
		
	}//method

	
	
	//b.logic
	public void printMsg(String msg)
	{
		System.out.println("Msg print by printMethod :: "+msg);
	}
	
}//class
