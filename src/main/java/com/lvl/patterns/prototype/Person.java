package com.lvl.patterns.prototype;

import java.util.Arrays;

public class Person {

	public String [] names;
	public Address address;
	
	public Person(String[] names, Address address) {
		super();
		this.names = names;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
	}
	
}
