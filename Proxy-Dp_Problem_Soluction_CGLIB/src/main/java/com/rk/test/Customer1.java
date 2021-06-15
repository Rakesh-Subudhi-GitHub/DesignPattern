package com.rk.test;

import java.util.Arrays;

import com.rk.comp.BankServiceImpl;
import com.rk.factory.BankServiceFactory;

public class Customer1 {
	
     public static void main(String[] args) {
	
    	 BankServiceImpl service=BankServiceFactory.getInstance(true);
	    
    	 System.out.println(service.getClass()+" ..... "+service.getClass().getSuperclass());
	     
    	 System.out.println(Arrays.toString(service.getClass().getDeclaredMethods()));
	      
    	 System.out.println(service.withdraw(10001, 30000));    
	      System.out.println("=========================");
	      System.out.println(service.withdraw(10001, 3000));

     }//main
}//class
