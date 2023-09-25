package com.lvl.patterns.structural.façade.client;

import com.lvl.patterns.structural.façade.Buffer;
import com.lvl.patterns.structural.façade.Console;
import com.lvl.patterns.structural.façade.Viewport;

public class FaçadeDemo {

    public static void main(String[] args) {
	
	Buffer buffer = new Buffer(30, 20);
	Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
	Console console = new Console(30, 20);
	
	console.addViewport(viewport);
	console.render();
    }

}
