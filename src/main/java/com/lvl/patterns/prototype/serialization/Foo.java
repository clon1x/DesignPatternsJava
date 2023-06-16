package com.lvl.patterns.prototype.serialization;

import java.io.Serializable;

public class Foo implements Serializable {

	private static final long serialVersionUID = -2965015223838247130L;

	public int stuff;
	public String whatever;
	
	public Foo(int stuff, String whatever) {
		super();
		this.stuff = stuff;
		this.whatever = whatever;
	}

	@Override
	public String toString() {
		return "Foo [stuff=" + stuff + ", whatever=" + whatever + "]";
	}
	
}
