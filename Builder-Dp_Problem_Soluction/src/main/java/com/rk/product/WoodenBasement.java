package com.rk.product;

import com.rk.product.interfac.IBasement;

public class WoodenBasement implements IBasement {
	
	public WoodenBasement() {
		System.out.println("WoodenBasement:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "WoodenBasement []";
	}
	
	

}
