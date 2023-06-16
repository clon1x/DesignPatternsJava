package com.lvl.patterns.builder.exercise;

public class Exercise {

	public static void main(String[] args) {
		CodeBuilder cb = new CodeBuilder("Person")
				.addField("name", "String")
				.addField("age", "int");
		
		System.out.println(cb);
	}

}
