package com.lvl.patterns.builder.clients;

import com.lvl.patterns.builder.faceted.Person;
import com.lvl.patterns.builder.faceted.PersonBuilder;

public class FacetedBuilderDemo {

	public static void main(String[] args) {
		
		Person john = new PersonBuilder()
			.lives()
				.in("London")
				.withPostcode("K4892")
				.at("Oxford St. 532")
			.works()
				.at("Kyocera")
				.asA("Chief Developer")
				.earning(250000)
			.build();
		
		System.out.println(john);
	}

}
