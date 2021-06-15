//DieselEngine.java (Dependent class)
package com.rk.comp;

public final class DieselEngine implements IEngine {
   
	
   public DieselEngine() {
	  System.out.println("DieselEngine:: 0-param constructor");
   }//constructor
   
	
	//@Override
	public void start() {
		System.out.println("DieselEngine is started");
	}

	//@Override
	public void stop() {
		System.out.println("DieselEngine is stopped");
	}

}//class
