//PetrolEngine.java (Dependent class)
package com.rk.comp;

public final class PetrolEngine implements IEngine {
   
   public PetrolEngine() {
	
	   System.out.println("PetrolEngine:: 0-param constructor");
    }//constructor
   
	
	public void start() {
		System.out.println("PetrolEngine is started");
	}

	public void stop() {
		System.out.println("PetrolEngine is stopped");
	}

}//class
