package com.lvl.patterns.structural.bridge.client;

import com.lvl.patterns.structural.bridge.Circle;
import com.lvl.patterns.structural.bridge.RasterRenderer;
import com.lvl.patterns.structural.bridge.Renderer;
import com.lvl.patterns.structural.bridge.Square;
import com.lvl.patterns.structural.bridge.VectorRenderer;

public class BridgeDemo {

    public static void main(String[] args) {
	
	Renderer vectorialRender = new VectorRenderer();
	Renderer rasterRender = new RasterRenderer();
	Circle circle = new Circle(10);
	Square square = new Square(2,5); 

	System.out.println("*** Vectorial rendering: ");
	circle.render(vectorialRender);
	square.render(vectorialRender);

	System.out.println("\n*** Raster rendering: ");
	circle.render(rasterRender);
	square.render(rasterRender);
	
    }

}
