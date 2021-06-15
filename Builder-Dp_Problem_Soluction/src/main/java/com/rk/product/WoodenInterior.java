package com.rk.product;

import com.rk.product.interfac.IInterior;

public class WoodenInterior implements IInterior {
   
	public WoodenInterior() {
		System.out.println("WoodenInterior:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "WoodenInterior []";
	}
	
	
	
}
