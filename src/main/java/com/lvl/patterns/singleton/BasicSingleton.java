package com.lvl.patterns.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    
    private static final long serialVersionUID = -950838993944145186L;
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
    
    protected Object readResolve() {
	return INSTANCE;
    }
    
}
