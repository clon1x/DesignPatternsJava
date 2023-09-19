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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        
        Point p = (Point) obj;
        return (p.x == x && p.y == y);
    }

    @Override
    public int hashCode() {
	return 31 * x + y;
    }
    
}
