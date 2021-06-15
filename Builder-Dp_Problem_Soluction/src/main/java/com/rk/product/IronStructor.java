package com.rk.product;

import com.rk.product.interfac.IStructure;

public class IronStructor implements IStructure {
	
	public IronStructor() {
		System.out.println("IronStructor:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IronStructor []";
	}
	
	

}
