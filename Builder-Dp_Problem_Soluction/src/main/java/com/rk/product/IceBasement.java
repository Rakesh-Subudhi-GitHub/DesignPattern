package com.rk.product;

import com.rk.product.interfac.IBasement;

public class IceBasement implements IBasement {
	
	public IceBasement() {
		System.out.println("IceBasement:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IceBasement []";
	}
	
	

}
