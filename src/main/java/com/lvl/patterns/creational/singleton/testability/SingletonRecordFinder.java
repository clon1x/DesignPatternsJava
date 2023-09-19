package com.lvl.patterns.creational.singleton.testability;

import java.util.List;

public class SingletonRecordFinder {
    
    private Database db;
    
    public SingletonRecordFinder(Database db) {
	this.db = db;
    }

    public int getTotalPopulation(List<String> names) {
	int result = 0;
	for (String name : names) {
	    result += db.getPopulation(name);
	}
	return result;
    }
}
