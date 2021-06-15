package com.rk.product;

import com.rk.product.interfac.IRoof;

public class IceRoof  implements IRoof {
     public IceRoof() {
		System.out.println("IceRoof:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IceRoof []";
	}
     
     
}
