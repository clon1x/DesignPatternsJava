package com.lvl.patterns.builder.exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CodeBuilder {

	private static final int INDENT_SIZE = 2;
	private String className;
	private Map<String, String> fields = new HashMap<>();
	
	public CodeBuilder(String className) {
		this.className = className;
	}
	
	public CodeBuilder addField(String fieldName, String type) {
		fields.put(fieldName, type);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String newLine = System.lineSeparator();
		
		builder.append(String.format("public class %s%s{%s", className, newLine, newLine));
		String indent = String.join("", Collections.nCopies(INDENT_SIZE, " "));
		fields.forEach((name, type) -> {
			builder.append(String.format("%spublic %s %s;%s", indent, type, name, newLine));
		} );
		builder.append("}");

		return builder.toString();
	}
	
}
