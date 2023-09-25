package com.lvl.patterns.structural.composite.exercise;

import java.util.ArrayList;

public class MyList extends ArrayList<ValueContainer>{

    private static final long serialVersionUID = -3257967917411180586L;

    public int sum() {
	int result = 0;
	for (ValueContainer vc : this) {
	    result += vc.sum();
	}
	return result;
    }
    
}
