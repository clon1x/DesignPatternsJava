package com.lvl.patterns.structural.composite.exercise;

public interface ValueContainer extends Iterable<Integer> {

    default int sum() {
	int result = 0;
	for (Integer i : this) {
	    result += i;
	}
	return result;
    }
    
}
