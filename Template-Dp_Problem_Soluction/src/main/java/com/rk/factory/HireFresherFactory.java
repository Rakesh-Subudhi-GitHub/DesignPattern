package com.rk.factory;

import com.rk.comp.HireDotNetFresher;
import com.rk.comp.HireFresher;
import com.rk.comp.HireJavaFresher;
import com.rk.comp.HireUIFresher;

public class HireFresherFactory {
	
	//ui or java or .net developer to take that test directly
	
  public static  HireFresher getInstance(String fresherType) {
	  
	  if(fresherType.equalsIgnoreCase("java")) 
		  return new HireJavaFresher();
	  
	  else if(fresherType.equalsIgnoreCase("dotNet"))
		  return  new HireDotNetFresher();
	  
	  else if(fresherType.equalsIgnoreCase("ui"))
		  return new HireUIFresher();
	  
	  else
	   throw new IllegalArgumentException("As of now we not recruiting  "+ fresherType+"  freshers");
  }
}
