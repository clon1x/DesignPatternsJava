package com.lvl.patterns.structural.bridge.shape;

import com.lvl.patterns.structural.bridge.renderer.Renderer;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
	this.radius = radius;
    }
    
    @Override
    public void render(Renderer renderer) {
	renderer.drawCircle(radius);
    }
    
}
