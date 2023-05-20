package com.lvl.patterns.builder.person;

public class PersonBuilder {

	protected Person person = new Person();
	
	public PersonBuilder withName(String name) {
		person.name = name;
		return this;
	}
	
	public Person build() {
		return person;
	}
	
}
