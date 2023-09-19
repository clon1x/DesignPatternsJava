package com.lvl.patterns.structural.adapter;

public class VectorRectangle extends VectorObject {

    private static final long serialVersionUID = 8716975612768830080L;
    
    public VectorRectangle(int x, int y, int width, int height) {
	
	Point A = new Point(x,y);
	Point B = new Point(x+width, y);
	Point C = new Point(x+width, y+height);
	Point D = new Point(x, y+height);
	
	this.add(new Line(A, B));
	this.add(new Line(B, C));
	this.add(new Line(C, D));
	this.add(new Line(D, A));
    }

}
