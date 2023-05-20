package com.lvl.solid.isp;

import com.lvl.solid.isp.interfaces.Multifunction;

public class MultifunctionPrinter implements Multifunction {

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
