package com.rk.test;

import com.rk.comp.ButterScotchIcecream;
import com.rk.comp.Icecream;
import com.rk.decorator.ChocoChipsDecorator;
import com.rk.decorator.DryFruitDecorator;
import com.rk.decorator.HoneyDecorator;

public class DecoratorDPTest2 {

	public static void main(String[] args) {
	     
		Icecream  ice1=new ButterScotchIcecream();
	     ice1.prepare();
	    
System.out.println("-----------------------------");

        Icecream ice2=new DryFruitDecorator(new ButterScotchIcecream());
	     ice2.prepare();
	    
System.out.println("..................................");

        Icecream ice3=new DryFruitDecorator(new HoneyDecorator(new ButterScotchIcecream()));
	     ice3.prepare();
	    
System.out.println("..................................");

 Icecream ice4=new DryFruitDecorator(new HoneyDecorator(new ChocoChipsDecorator(new ButterScotchIcecream())));
	     ice4.prepare();

}//main

}//class
