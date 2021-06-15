package com.rk.sdp;

import com.rk.common.CommonUtils;

public class Printer extends CommonUtils {

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


	//cloneing problem solving
	//sol-1   //call inner printret class and pass those so automatically same address it work
		         //but not recomended bcz cloan means new address is requried so that use 2nd tech
/*	@Override
	public  Object clone()throws CloneNotSupportedException  {
		return InnerPrinter.InstanceVariable;
	}
*/
		//sol-2 is To  Stop Cloning
		@Override
		public  Object clone()throws CloneNotSupportedException  {
			throw new CloneNotSupportedException("Cloning not allowed in Singleton Printer classs");
		}
		
	//b.logic
	public void printMsg(String msg)
	{
		System.out.println("Msg print by printMethod :: "+msg);
	}
	
}//class
