package com.lvl.patterns.structural.façade.client;

import com.lvl.patterns.structural.façade.Console;

public class FaçadeDemo {

    public static void main(String[] args) {

	Console console = Console.newConsole(30, 20);
	console.render();
    }

}
