package com.rk.test;

import com.rk.sdp.Printer;

public class SingletonCloneTest {

	public static void main(String[] args) {
		
		Printer p1=Printer.getInstaceMethod();
		
		System.out.println(p1.hashCode());
		System.out.println(p1.getClass().getClassLoader());
		
		Printer p2=Printer.getInstaceMethod();
		
		System.out.println(p2.hashCode());
		System.out.println(p2.getClass().getClassLoader());
	}//main
}//class
