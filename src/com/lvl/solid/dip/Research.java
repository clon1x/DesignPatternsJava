package com.lvl.solid.dip;

public class Research {

	public Research(RelationshipBrowser browser) 
	{
		browser.findAllChildrenOf("John")
			.forEach(p -> System.out.println("John has a child called " + p.name));
	}
}
