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

    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null || obj.getClass() != getClass()) return false;
	
	Line line = (Line) obj;
	
	if (start != null ? !start.equals(line.start): line.start != null) return false;
	return end != null ? end.equals(line.end) : line.end == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 310 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
    
}
