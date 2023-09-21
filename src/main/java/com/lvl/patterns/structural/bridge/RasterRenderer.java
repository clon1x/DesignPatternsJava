package com.lvl.patterns.structural.bridge;

public class RasterRenderer implements Renderer {

    @Override
    public void drawLine(Point from, Point to) {
	System.out.println("Drawing a raster line from " + from + " to " + to);
    }

    @Override
    public void drawCircle(float radius) {
	System.out.println("Drawing a raster circle of radius " + radius);
    }

}
