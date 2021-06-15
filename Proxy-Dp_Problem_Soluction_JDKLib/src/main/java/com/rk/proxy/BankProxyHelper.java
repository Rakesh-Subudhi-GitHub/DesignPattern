package com.rk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.rk.comp.BankServiceImpl;
import com.rk.comp.IBankService;

public class BankProxyHelper implements InvocationHandler {
	private IBankService  real;
	
	public BankProxyHelper() {
		System.out.println("BankProxyHelper:: 0-param constructor");
		real=new BankServiceImpl();
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	       
		Object retVal=null;
		
	if(method.getName().equalsIgnoreCase("withdraw")) {
	    if(((Double)args[1])<=4000)
	        	 retVal=method.invoke(real, args); //calls the real method
	    else {
	    	  args[1]=4000;
	        	   retVal=method.invoke(real, args);  //calls the real method
	        	   retVal=retVal+" u can not witdraw more than 4000 at a time";
	   
	         }//else
	   }//if
		
	else {
	     retVal=method.invoke(real, args);
	     }
	
		return retVal;
		
	}//method

}//class
