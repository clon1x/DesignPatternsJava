package com.lvl.patterns.structural.adapter;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {

    private static int count = 0;
    private static Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;

    public LineToPointAdapter(Line line) {
	hash = line.hashCode();
	if (cache.containsKey(hash)) {
	    System.out.println("Cached line. Will not be re-generated.");
	    return; // cached line
	}
	
	System.out.println(String.format("%d: Generating a bunch of points for %s (caching).", ++count, line));
	
	int left = Math.min(line.start.x, line.end.x);
	int right = Math.max(line.start.x, line.end.x);
	int top = Math.min(line.start.y, line.end.y);
	int bottom = Math.max(line.start.y, line.end.y);
	int dx = right - left;
	int dy = bottom - top;
	
	List<Point> points = new ArrayList<>();
	if (dx == 0) {
	    verticalLine(points, left, top, bottom);
	} else if (dy == 0) {
	    horizontalLine(points, top, left, right);
	} else {
	    throw new InvalidParameterException("Slanted lines are not supported!");
	}
	cache.put(hash, points);
    }

    private void verticalLine(List<Point> points, int x, int top, int bottom) {
	for (int y = top; y <= bottom; y++) {
	    points.add(new Point(x, y));
	}
    }

    private void horizontalLine(List<Point> points, int y, int left, int right) {
	for (int x = left; x <= right; x++) {
	    points.add(new Point(x, y));
	}
    }

    @Override
    public Iterator<Point> iterator() {
	return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
	cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
	return cache.get(hash).spliterator();
    }
    
}
