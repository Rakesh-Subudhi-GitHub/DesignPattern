//IcecreamDecorator.java (AbstractDecorator)
package com.rk.decorator;

import com.rk.comp.Icecream;

public abstract class IcecreamDecorator implements Icecream {
   
	private Icecream icecream;  //Composition (HAS-A property)
    
    public IcecreamDecorator(Icecream icecream) {
		 this.icecream=icecream;
	}
   
	
    public void prepare() {
		 icecream.prepare();
	}

}//class
