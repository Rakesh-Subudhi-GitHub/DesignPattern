package com.rk.product;

import com.rk.product.interfac.IRoof;

public class WoodenRoof  implements IRoof {
     public WoodenRoof() {
		System.out.println("WoodenRoof:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "WoodenRoof []";
	}
     
     
}
