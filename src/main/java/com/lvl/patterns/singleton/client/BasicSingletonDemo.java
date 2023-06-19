package com.lvl.patterns.singleton.client;

import com.lvl.patterns.singleton.BasicSingleton;

public class BasicSingletonDemo {

    public static void main(String[] args) {

	BasicSingleton singleton = BasicSingleton.getInstance();
	singleton.setValue(123);
	System.out.println(singleton.getValue());
	
    }
    
}
