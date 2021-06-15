package com.rk.factory;

import com.rk.comp.BankServiceImpl;
import com.rk.comp.IBankService;
import com.rk.proxy.BankServiceProxyImpl;

public class BankServiceFactory {
	
     //factory pattern
	public static IBankService  getInstance(boolean demonitisation) {
		IBankService service=null;
		
		if(demonitisation)
			   service=new BankServiceProxyImpl(); //proxy class obj
		 else
			   service= new  BankServiceImpl(); //real object
		
		return service;
	}//method
}//class
