package com.lvl.patterns.builder.clients;

import com.lvl.patterns.builder.person.EmployeeBuilder;
import com.lvl.patterns.builder.person.Person;

public class PersonBuilderDemo {

	public static void main(String[] args) {
		
		Person john =
			new EmployeeBuilder()
				.withName("John")
				.withPosition("Head Developer")
				.build();
			
		System.out.println(john);
	}

}
