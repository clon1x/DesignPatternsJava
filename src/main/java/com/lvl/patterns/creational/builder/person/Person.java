package com.lvl.patterns.creational.builder.person;

public class Person {
	
	public String name;
	public String position;
	
	@Override
	public String toString() {
		return String.format("Person [name=%s, position=%s]", name, position);
	}
	
	
}
