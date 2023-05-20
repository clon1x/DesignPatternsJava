package com.lvl.solid.ISP;

public class MultifunctionPrinter implements Machine {

	@Override
	public void print(Document d) {
		// print document
	}

	@Override
	public void fax(Document d) {
		// fax the document
	}

	@Override
	public void scan(Document d) {
		// scan the document
	}

}
