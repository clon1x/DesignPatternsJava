package com.lvl.solid.dip.tuples;

public class Triplet<S,T,U> {
	
	private S a;
	private T b;
	private U c;
	
	public Triplet(S a, T b, U c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public S getValue0() {
		return a;
	}

	public T getValue1() {
		return b;
	}

	public U getValue2() {
		return c;
	}

}
