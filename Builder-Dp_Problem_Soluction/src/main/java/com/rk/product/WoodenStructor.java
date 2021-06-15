package com.rk.product;

import com.rk.product.interfac.IStructure;

public class WoodenStructor implements IStructure {
	
	public WoodenStructor() {
		System.out.println("WoodenStructor:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "WoodenStructor []";
	}
	
	

}
