package com.rk.factory;

import java.lang.reflect.Proxy;

import com.rk.comp.BankServiceImpl;
import com.rk.comp.IBankService;
import com.rk.proxy.BankProxyHelper;

public class BankServiceFactory {
	
     //factory pattern
	public static IBankService  getInstance(boolean demonitisation) {
		
		IBankService service=null;
		
		if(demonitisation)
		    service=(IBankService)Proxy.newProxyInstance(IBankService.class.getClassLoader(),
		         		                                      new Class[] {IBankService.class},
			      		                                      new BankProxyHelper());
		 else
			   service= new  BankServiceImpl(); //real object
		 
		return service;

	}//method
}//class
