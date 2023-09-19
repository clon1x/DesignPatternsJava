package com.lvl.patterns.singleton.client;

import java.util.List;

import com.lvl.patterns.singleton.testability.Database;
import com.lvl.patterns.singleton.testability.SingletonDatabase;
import com.lvl.patterns.singleton.testability.SingletonRecordFinder;

public class TestabilityDemo {
    
    public static void main(String[] args) {
	Database db = SingletonDatabase.getInstance();
	SingletonRecordFinder rf = new SingletonRecordFinder(db);
	List<String> names = List.of("Manila", "Mexico City");
	int totalPopulation = rf.getTotalPopulation(names);
	System.out.println(String.format("The total population of %s is %,d.", names, totalPopulation));
    }

}
