package com.rk.comp;

public class Square implements IShape {
	private String label;
	
	public Square() {
		System.out.println("Square: 0-param constructor");
		label="square";
	}

	public void draw(float side, String fillColor, String lineStyle) {
	    System.out.println("drawing Square with side lenght :: "+side +" having fillColor ::"+fillColor+" , lineStyle::"+lineStyle);
	}

}//class
