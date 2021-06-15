package com.rk.product;

import com.rk.product.interfac.IInterior;

public class GlassInterior implements IInterior {
   
	public GlassInterior() {
		System.out.println("GlassInterior:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "GlassInterior []";
	}
	
	
	
}
