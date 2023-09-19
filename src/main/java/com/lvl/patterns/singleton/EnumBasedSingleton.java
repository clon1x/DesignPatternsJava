package com.lvl.patterns.singleton;

public enum EnumBasedSingleton {

    INSTANCE;
    
    private int value;

    EnumBasedSingleton() {
	setValue(42);
    }

    public int getValue() {
	return value;
    }

    public void setValue(int value) {
	this.value = value;
    }
    
}
