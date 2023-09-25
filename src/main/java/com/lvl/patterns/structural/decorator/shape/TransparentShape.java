package com.lvl.patterns.structural.decorator.shape;

public class TransparentShape implements Shape {

    private Shape shape;
    private int transparency;
    
    public TransparentShape(Shape shape, int transparency) {
	super();
	this.shape = shape;
	this.transparency = transparency;
    }

    @Override
    public String info() {
	return shape.info() + " and transparency of " + transparency + "%";
    }

    @Override
    public void resize(float factor) {
	shape.resize(factor);
    }

}
