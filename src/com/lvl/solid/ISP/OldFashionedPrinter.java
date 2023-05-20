package com.lvl.solid.ISP;

public class OldFashionedPrinter implements Machine {

	@Override
	public void print(Document d) {
		// print the document
	}

	@Override
	public void fax(Document d) {
		throw new UnsupportedOperationException("Sorry, the Fax operation is not supported by this printer!");
	}

	@Override
	public void scan(Document d) {
		throw new UnsupportedOperationException("Sorry, the scanning operation is not supported by this printer!");
	}

}
