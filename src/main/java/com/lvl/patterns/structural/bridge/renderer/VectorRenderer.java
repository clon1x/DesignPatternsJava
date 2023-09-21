package com.lvl.patterns.structural.bridge.renderer;

import com.lvl.patterns.structural.bridge.Point;

public class VectorRenderer implements Renderer {

    @Override
    public void drawLine(Point from, Point to) {
	System.out.println("Drawing a vectorial line from " + from + " to " + to);
    }

    @Override
    public void drawCircle(float radius) {
	System.out.println("Drawing a vectorial circle of radius " + radius);
    }

}
