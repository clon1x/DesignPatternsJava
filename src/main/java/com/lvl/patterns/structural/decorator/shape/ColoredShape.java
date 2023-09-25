package com.lvl.patterns.structural.decorator.shape;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;
    
    public ColoredShape(Supplier<? extends T> constructor, String color) {
	shape = constructor.get();
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
