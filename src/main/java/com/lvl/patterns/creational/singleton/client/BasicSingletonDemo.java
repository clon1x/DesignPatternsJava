package com.lvl.patterns.creational.singleton.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.lvl.patterns.creational.singleton.BasicSingleton;

public class BasicSingletonDemo {

    static void saveToFile(BasicSingleton singleton,
	    		   String filename) throws Exception {
	try (FileOutputStream fileOut = new FileOutputStream(filename);
	     ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	    
	    out.writeObject(singleton);
	}
    }
    
    static BasicSingleton readFromFile(String filename) throws Exception {
	
	try (FileInputStream fileIn = new FileInputStream(filename);
	     ObjectInputStream in = new ObjectInputStream(fileIn)) {
	    
	    return (BasicSingleton) in.readObject();
	}
    }
    
    
    public static void main(String[] args) throws Exception {

	
	BasicSingleton singleton = BasicSingleton.getInstance();
	singleton.setValue(123);
	
	String  filename = "singleton.obj";
	saveToFile(singleton, filename);
	BasicSingleton singleton2 = readFromFile(filename);
	
	singleton2.setValue(456);
	
	System.out.println(singleton.getValue());
	System.out.println(singleton2.getValue());
	
    }
    
}
