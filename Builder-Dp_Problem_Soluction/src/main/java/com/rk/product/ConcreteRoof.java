package com.rk.product;

import com.rk.product.interfac.IRoof;

public class ConcreteRoof  implements IRoof {
     public ConcreteRoof() {
		System.out.println("ConcreteRoof:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteRoof []";
	}
     
     
}
