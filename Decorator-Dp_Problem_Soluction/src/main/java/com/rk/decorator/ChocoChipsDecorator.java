//ChocoChipsDecorator .java (ConcreteDecorator)
package com.rk.decorator;

import com.rk.comp.Icecream;

public class ChocoChipsDecorator extends IcecreamDecorator {

	public ChocoChipsDecorator(Icecream icecream) {
		super(icecream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}
	
	public void  addChocoChips() {
		 System.out.println("adding Chocochips");
	}
	

}
