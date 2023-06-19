package com.lvl.patterns.singleton;

public class BasicSingleton {
    
    private int value = 0;
    
    private BasicSingleton() {}
    
    private static final BasicSingleton INSTANCE
    	= new BasicSingleton();
    
    public static BasicSingleton getInstance() {
	return INSTANCE;
    }

    public int getValue() {
	return value;
    }

    public void setValue(int value) {
	this.value = value;
    }
    
}
