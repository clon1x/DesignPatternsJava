package com.lvl.patterns.prototype.client;

import org.apache.commons.lang3.SerializationUtils;

import com.lvl.patterns.prototype.serialization.Foo;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Foo foo = new Foo(1, "Hello");
		Foo foo2 = SerializationUtils.roundtrip(foo);
		
		foo2.stuff = 2;
		foo2.whatever = "Bye!";
		
		System.out.println(foo);
		System.out.println(foo2);
	}

}
