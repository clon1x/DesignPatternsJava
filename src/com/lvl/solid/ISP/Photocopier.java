package com.lvl.solid.ISP;

import com.lvl.solid.ISP.interfaces.Printer;
import com.lvl.solid.ISP.interfaces.Scanner;

public class Photocopier implements Printer, Scanner {

	private LaserPrinter printer = new LaserPrinter();
	private ScannerImpl scanner = new ScannerImpl();
	
	@Override
	public void scan(Document d) {
		scanner.scan(d);
	}

	@Override
	public void print(Document d) {
		printer.print(d);
	}

}
