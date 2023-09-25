package com.lvl.patterns.structural.decorator.shape;

public class ColoredShape implements Shape {

    private Shape shape;
    private String color;
    
    public ColoredShape(Shape shape, String color) {
	super();
	this.shape = shape;
	this.color = color;
    }

    @Override
    public String info() {
	return shape.info() + " and " + color + " color";
    }

    @Override
    public void resize(float factor) {
	shape.resize(factor);
    }

}
