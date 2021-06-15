package com.rk.product;

import com.rk.product.interfac.IBasement;

public class ConcreteBasement implements IBasement {
	
	public ConcreteBasement() {
		System.out.println("ConcreteBasement:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteBasement []";
	}
	
	

}
