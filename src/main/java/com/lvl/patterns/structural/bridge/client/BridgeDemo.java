package com.lvl.patterns.structural.bridge.client;

import com.lvl.patterns.structural.bridge.renderer.RasterRenderer;
import com.lvl.patterns.structural.bridge.renderer.Renderer;
import com.lvl.patterns.structural.bridge.renderer.VectorRenderer;
import com.lvl.patterns.structural.bridge.shape.Circle;
import com.lvl.patterns.structural.bridge.shape.Square;

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
