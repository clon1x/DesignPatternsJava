package com.lvl.patterns.structural.composite.client;

import com.lvl.patterns.structural.composite.Circle;
import com.lvl.patterns.structural.composite.GraphicObject;
import com.lvl.patterns.structural.composite.Square;

public class CompositeDemo {

    public static void main(String[] args) {
	
	GraphicObject drawing = new GraphicObject();
	drawing.setName("My Drawing");

	Circle yellowCircleGroup = new Circle("Yellow");
	yellowCircleGroup.children.add(new Circle("Blue"));
	yellowCircleGroup.children.add(new Square("Blue"));
	
	GraphicObject group = new GraphicObject();
	group.children.add(new Square("Magenta"));
	
	yellowCircleGroup.children.add(group);
	
	drawing.children.add(yellowCircleGroup);
	drawing.children.add(new Square("Red"));

	System.out.println(drawing);

    }

}
