package com.lvl.patterns.prototype.client;

import com.lvl.patterns.prototype.Address;
import com.lvl.patterns.prototype.Person;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person john = new Person(new String[] {"John", "Smith"},
			new Address("London Road", 123));

		Person jane = john.clone();
		jane.names[0] = "Jane";
		jane.address.houseNumber = 124;
	
		System.out.println(john);
		System.out.println(jane);
	}

}
