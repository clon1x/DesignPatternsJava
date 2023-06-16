package com.lvl.patterns.prototype;

public class Person {

	public String name;
	public Address address;
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person(Person other) {
		this(other.name, new Address(other.address));
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
