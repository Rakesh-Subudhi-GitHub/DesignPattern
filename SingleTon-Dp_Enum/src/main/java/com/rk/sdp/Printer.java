package com.rk.sdp;

import java.io.Serializable;

public enum Printer implements Cloneable,Serializable {
	  INSTANCE;  //internally it equal to public static final INSTANCE=new Printer();
	
	
	//static  factory method  (optional)
	public static  Printer getInstaceMethod() {
		return INSTANCE;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
}//class