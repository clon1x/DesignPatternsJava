package com.lvl.solid.LSP;

public class RectangleFactory extends Rectangle {

	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width, height);
	}
	
	public static Rectangle newSquare(int side) {
		return new Rectangle(side, side);
	}

}
