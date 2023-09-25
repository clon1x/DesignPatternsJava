package com.lvl.patterns.structural.decorator.adapterdecorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStringBuilderTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
	
	// given
	MyStringBuilder sb = new MyStringBuilder();
	String expected = "hello world" + System.lineSeparator() + "and you too";
	
	// when
	sb.append("hello").appendLine(" world");
	String actual = sb.concat("and you too").toString();
	
	// then 
	assertEquals(expected, actual);
    }

}
