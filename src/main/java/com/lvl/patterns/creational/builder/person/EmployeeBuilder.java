package com.lvl.patterns.creational.builder.person;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

	public EmployeeBuilder withPosition(String position) {
		person.position = position;
		return self();
	}

	@Override
	protected EmployeeBuilder self() {
		return this;
	}
	
}
