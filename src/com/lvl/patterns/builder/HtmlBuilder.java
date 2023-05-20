package com.lvl.patterns.builder;

public class HtmlBuilder {

	private String rootName;
	private HtmlElement root = new HtmlElement();
	
	public HtmlBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}
	
	public HtmlBuilder addChild(String childName, String childText) {
		HtmlElement child = new HtmlElement(childName, childText);
		root.elements.add(child);
		return this;
	}
	
	public void clear() {
		root = new HtmlElement();
		root.name = rootName;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}
	
}
