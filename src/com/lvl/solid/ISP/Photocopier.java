package com.lvl.solid.ISP;

import com.lvl.solid.ISP.interfaces.Printer;
import com.lvl.solid.ISP.interfaces.Scanner;

public class Photocopier implements Printer, Scanner {

	@Override
	public void scan(Document d) {
		// scan document
	}

	@Override
	public void print(Document d) {
		// print document
	}

}
