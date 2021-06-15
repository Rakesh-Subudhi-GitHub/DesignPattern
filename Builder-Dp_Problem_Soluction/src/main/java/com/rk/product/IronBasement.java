package com.rk.product;

import com.rk.product.interfac.IBasement;

public class IronBasement implements IBasement {
	
	public IronBasement() {
		System.out.println("IronBasement:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IronBasement []";
	}
	
	

}
