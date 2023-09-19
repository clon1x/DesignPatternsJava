package com.lvl.patterns.creational.prototype.client;

import com.lvl.patterns.creational.prototype.Address;
import com.lvl.patterns.creational.prototype.Person;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person john = new Person("John",
			new Address("London Road", 123, "London", "UK"));

		Person jane = new Person(john);
		jane.name = "Jane";
		jane.address.houseNumber = 124;
	
		System.out.println(john);
		System.out.println(jane);
	}

}
