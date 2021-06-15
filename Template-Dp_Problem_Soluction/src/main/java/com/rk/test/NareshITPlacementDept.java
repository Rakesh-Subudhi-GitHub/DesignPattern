//NareshITPlacementDept.java
package com.rk.test;

import com.rk.comp.HireFresher;
import com.rk.factory.HireFresherFactory;

public class NareshITPlacementDept {

	public static void main(String[] args) {
		
		HireFresher UIFresher=HireFresherFactory.getInstance("ui");
	    
		boolean result=UIFresher.recruiteFresher();
	    
		if(result)
	    System.out.println("UI Fresher is selected");
	    
		else
	     System.out.println("UI Fresher is not selected");
	
	}//main

}//class
