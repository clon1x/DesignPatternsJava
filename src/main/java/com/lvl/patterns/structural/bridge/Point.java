package com.lvl.patterns.structural.bridge;

public class Point {

    private float x, y;
    
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Point [x=");
	builder.append(x);
	builder.append(", y=");
	builder.append(y);
	builder.append("]");
	return builder.toString();
    }

}
