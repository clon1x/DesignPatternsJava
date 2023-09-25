package com.lvl.patterns.structural.composite.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValueContainerTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
	SingleValue single = new SingleValue(12);
	ManyValues many = new ManyValues();
	many.add(1);
	many.add(200);
	
	MyList list = new MyList();
	
	list.add(single);
	list.add(many);

	assertEquals(213, list.sum());
    }

}
