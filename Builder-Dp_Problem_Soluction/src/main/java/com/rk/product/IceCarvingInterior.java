package com.rk.product;

import com.rk.product.interfac.IInterior;

public class IceCarvingInterior implements IInterior {
   
	public IceCarvingInterior() {
		System.out.println("IceCarving:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IceCarvingInterior []";
	}
	
	
	
}
