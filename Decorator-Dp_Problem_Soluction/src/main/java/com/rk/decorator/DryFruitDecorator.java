//DryFruitDecorator .java (ConcreteDecorator)
package com.rk.decorator;

import com.rk.comp.Icecream;

public class DryFruitDecorator extends IcecreamDecorator {

	public DryFruitDecorator(Icecream icecream) {
		super(icecream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	
	public void  addDryFruits() {
		 System.out.println("adding DryFruits");
	}
	

}
