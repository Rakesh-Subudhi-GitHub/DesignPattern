package com.rk.test;

import com.rk.comp.Icecream;
import com.rk.comp.VanilaIcecream;
import com.rk.decorator.ChocoChipsDecorator;
import com.rk.decorator.DryFruitDecorator;
import com.rk.decorator.HoneyDecorator;

public class DecoratorDPTest1 {

	public static void main(String[] args) {
	     
		Icecream  ice1=new VanilaIcecream();
	     ice1.prepare();
	    
System.out.println("-----------------------------");

		Icecream ice2=new DryFruitDecorator(new DryFruitDecorator(new VanilaIcecream()));
	     ice2.prepare();
	    
System.out.println("..................................");

        Icecream ice3=new DryFruitDecorator(new HoneyDecorator(new VanilaIcecream()));
	     ice3.prepare();
	    
System.out.println("..................................");

   Icecream ice4=new DryFruitDecorator(new HoneyDecorator(new ChocoChipsDecorator(new VanilaIcecream())));
	     ice4.prepare();

}//main

}//class
