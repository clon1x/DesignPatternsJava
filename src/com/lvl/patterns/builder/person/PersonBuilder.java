package com.lvl.patterns.builder.person;

public class PersonBuilder<T extends PersonBuilder<T>>{

	protected Person person = new Person();
	
	public T withName(String name) {
		person.name = name;
		return self();
	}
	
	@SuppressWarnings("unchecked")
	protected T self() {
		return (T) this;
	}
	
	public Person build() {
		return person;
	}
	
}
