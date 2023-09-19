package com.lvl.patterns.singleton.testability;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lvl.patterns.creational.singleton.testability.Database;
import com.lvl.patterns.creational.singleton.testability.SingletonRecordFinder;

class SingletonRecordFinderTest {
    
    Database mockDb = new DummyDatabase();

    @Test
    void testGetTotalPopulation() {
	Database db = new DummyDatabase();
	SingletonRecordFinder rf = new SingletonRecordFinder(db);
	List<String> names = List.of("alpha", "gamma");
	int tp = rf.getTotalPopulation(names);
	assertEquals(4, tp);
    }

}
