package com.lvl.patterns.structural.adapter.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lvl.patterns.structural.adapter.Line;
import com.lvl.patterns.structural.adapter.LineToPointAdapter;
import com.lvl.patterns.structural.adapter.Point;
import com.lvl.patterns.structural.adapter.VectorObject;
import com.lvl.patterns.structural.adapter.VectorRectangle;

public class VectorRasterDemo {

    private final static List<VectorObject> vectorObjects
    	= new ArrayList<>(Arrays.asList(
    		new VectorRectangle(1, 1, 10, 10),
    		new VectorRectangle(3, 3, 6, 6)));
    
    public static void draw(Point p) {
	System.out.println(".");
    }
    
    public static void draw() {
	for (VectorObject vectorObject : vectorObjects) {
	    drawLines(vectorObject);
	}
    }
    
    private static void drawLines(VectorObject vectorObject) {
	for (Line line : vectorObject) {
	    drawLine(line);
	}
    }

    private static void drawLine(Line line) {
	System.out.println(line + " - hashCode = " + line.hashCode());
	LineToPointAdapter points = new LineToPointAdapter(line);
	points.forEach(VectorRasterDemo::draw);
    }

    public static void main(String[] args) {
	draw();
	draw();
    }

}
