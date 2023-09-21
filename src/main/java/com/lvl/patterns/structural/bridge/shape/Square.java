package com.lvl.patterns.structural.bridge.shape;

import com.lvl.patterns.structural.bridge.Point;
import com.lvl.patterns.structural.bridge.renderer.Renderer;

public class Square extends Shape {

    private int width;
    private int height;

    public Square(int width, int height) {
	this.width = width;
	this.height = height;
    }

    @Override
    public void render(Renderer renderer) {
	
	Point A = new Point(0,0);
	Point B = new Point(width, 0);
	Point C = new Point(width, height);
	Point D = new Point(0, height);
	
	
	renderer.drawLine(A, B);
	renderer.drawLine(B, C);
	renderer.drawLine(C, D);
	renderer.drawLine(D, A);
    }

}
