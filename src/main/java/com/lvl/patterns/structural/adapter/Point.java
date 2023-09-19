package com.lvl.patterns.structural.adapter;

public class Point {

    public int x, y;
    
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
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
