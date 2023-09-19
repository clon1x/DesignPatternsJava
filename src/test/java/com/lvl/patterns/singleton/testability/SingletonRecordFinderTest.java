package com.lvl.patterns.singleton.testability;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonRecordFinderTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testGetTotalPopulation() {
	SingletonRecordFinder rf = new SingletonRecordFinder();
	List<String> names = List.of("Seoul", "Mexico City");
	int tp = rf.getTotalPopulation(names);
	assertEquals(34900000, tp);
    }

}
