package com.lvl.patterns.builder.clients;

import com.lvl.patterns.builder.HtmlBuilder;

public class Demo {

	public static void main(String[] args) {
		
		HtmlBuilder builder = new HtmlBuilder("ul");
		builder.addChild("li", "hello");
		builder.addChild("li", "world");
		
		System.out.println(builder);
	}

}
