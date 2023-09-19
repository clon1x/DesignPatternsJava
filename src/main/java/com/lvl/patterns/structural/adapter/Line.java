package com.lvl.patterns.structural.adapter;

public class Line {

    public Point start, end;

    public Line(Point start, Point end) {
	super();
	this.start = start;
	this.end = end;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Line [start=");
	builder.append(start);
	builder.append(", end=");
	builder.append(end);
	builder.append("]");
	return builder.toString();
    }
    
}
