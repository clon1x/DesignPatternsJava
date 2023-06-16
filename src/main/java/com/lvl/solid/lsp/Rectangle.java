package com.lvl.solid.lsp;

public class Rectangle {

	protected int width, height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		return width * height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSquare() {
		return width == height;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle [width=%s, height=%s]", width, height);
	}

}
