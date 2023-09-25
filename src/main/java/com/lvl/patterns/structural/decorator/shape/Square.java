package com.lvl.patterns.structural.decorator.shape;

public class Square implements Shape {

    private float side;
    
    public Square() {}
    
    public Square(float side) {
	this.side = side;
    }
    
    public void resize(float factor) {
	side *= factor;
    }
    
    @Override
    public String info() {
	return "A square of side " + side;
    }

}
