package com.lvl.solid.dip.clients;

import com.lvl.solid.dip.Person;
import com.lvl.solid.dip.Relationships;
import com.lvl.solid.dip.Research;

public class Demo {

	public static void main(String[] args) {
		
		Person parent = new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Jane");

		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);
		
		new Research(relationships);
	}
}
