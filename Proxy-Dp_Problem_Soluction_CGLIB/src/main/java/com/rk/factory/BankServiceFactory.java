package com.rk.factory;

import com.rk.comp.BankServiceImpl;
import com.rk.proxy.BankProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
     //factory pattern
	public static BankServiceImpl  getInstance(boolean demonitisation) {
		
		BankServiceImpl service=null;
		
		if(demonitisation)
			   service=(BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankProxyHelper());  //generates and gives InMemory proxy class obj
		 else
			   service= new  BankServiceImpl(); //real object
		return service;
		
	}//method
}//class
