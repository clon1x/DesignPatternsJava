package com.lvl.patterns.structural.bridge.renderer;

import com.lvl.patterns.structural.bridge.Point;

public interface Renderer {

    void drawLine(Point from, Point to);
    void drawCircle(float radius);
    
}
