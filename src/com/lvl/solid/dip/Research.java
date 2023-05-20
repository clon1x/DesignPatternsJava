package com.lvl.solid.dip;

import java.util.List;

import com.lvl.solid.dip.tuples.Triplet;

public class Research {

	public Research(Relationships relationships) 
	{
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		relations.stream()
			.filter(x -> x.getValue0().name.equals("John")
					&& x.getValue1() == Relationship.PARENT)
			.forEach(ch -> System.out.println(
					"John has a child called " + ch.getValue2().name
					));
	}
}
