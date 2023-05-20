package com.lvl.patterns.builder.clients;

import com.lvl.patterns.builder.person.Person;
import com.lvl.patterns.builder.person.PersonBuilder;

public class PersonBuilderDemo {

	public static void main(String[] args) {
		
		Person john =
			new PersonBuilder()
				.withName("John")
				.build();
			
		System.out.println(john);
	}

}
