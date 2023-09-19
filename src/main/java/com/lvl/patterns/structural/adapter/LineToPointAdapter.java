package com.lvl.patterns.structural.adapter;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class LineToPointAdapter extends ArrayList<Point> {

    private static final long serialVersionUID = 4399500947481173051L;
    private static int count = 0;

    public LineToPointAdapter(Line line) {
	System.out.println(String.format("%d: Generating a bunch of points for %s (no caching).", ++count, line));
	
	int left = Math.min(line.start.x, line.end.x);
	int right = Math.max(line.start.x, line.end.x);
	int top = Math.min(line.start.y, line.end.y);
	int bottom = Math.max(line.start.y, line.end.y);
	int dx = right - left;
	int dy = bottom - top;
	
	if (dx == 0) {
	    verticalLine(left, top, bottom);
	} else if (dy == 0) {
	    horizontalLine(top, left, right);
	} else {
	    throw new InvalidParameterException("Slanted lines are not supported!");
	}
    }

    private void verticalLine(int x, int top, int bottom) {
	for (int y = top; y <= bottom; y++) {
	    this.add(new Point(x, y));
	}
	
    }

    private void horizontalLine(int y, int left, int right) {
	for (int x = left; x <= right; x++) {
	    this.add(new Point(x, y));
	}
	
    }
    
}
