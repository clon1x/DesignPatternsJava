package com.lvl.patterns.structural.bridge;

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
