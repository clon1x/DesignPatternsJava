package com.lvl.solid.LSP;

public class LSPDemo {
	
	public static void useRectangle(Rectangle rectangle) {
		int width = rectangle.getWidth();
		rectangle.setHeight(10);
		
		System.out.println("Expected area: " + width + " times 10 = " + width * 10);
		System.out.println("Real area value: " + rectangle.getArea() + "\n");
	}
	

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 10);
		Rectangle square = new Square(5);

		useRectangle(rectangle);
		useRectangle(square);
	}

}
