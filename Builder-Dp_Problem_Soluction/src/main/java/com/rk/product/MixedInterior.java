package com.rk.product;

import com.rk.product.interfac.IInterior;

public class MixedInterior implements IInterior {
   
	public MixedInterior() {
		System.out.println("MixedInterior:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "MixedInterior []";
	}
	
	
	
}
