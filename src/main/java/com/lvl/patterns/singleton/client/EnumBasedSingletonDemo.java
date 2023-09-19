package com.lvl.patterns.singleton.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.lvl.patterns.singleton.EnumBasedSingleton;

public class EnumBasedSingletonDemo {

    static void saveToFile(EnumBasedSingleton singleton, String filename) throws Exception {
	try (FileOutputStream fileOut = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

	    out.writeObject(singleton);
	}
    }

    static EnumBasedSingleton readFromFile(String filename) throws Exception {

	try (FileInputStream fileIn = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fileIn)) {

	    return (EnumBasedSingleton) in.readObject();
	}
    }

    public static void main(String[] args) throws Exception {

	String filename = "singleton.obj";

	EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
	
	// comment out these two lines after saving the file
	// to verify that the value 123 is never persisted into it
	singleton.setValue(123);
	saveToFile(singleton, filename);

	EnumBasedSingleton singleton2 = readFromFile(filename);

	System.out.println(singleton.getValue());
	System.out.println(singleton2.getValue());

    }

}
