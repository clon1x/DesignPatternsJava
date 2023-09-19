package com.lvl.patterns.creational.singleton.multiton;

import java.util.HashMap;
import java.util.Map;

public class Printer {

    private static Map<Subsystem, Printer> instances = new HashMap<>();
    private static int instanceCount = 0;

    private Printer() {
	System.out.println(String.format("A total of %s instances created so far.",
		++instanceCount));
    }

    public static Printer get(Subsystem ss) {
	if (instances.containsKey(ss))
	    return instances.get(ss);

	Printer instance = new Printer();
	instances.put(ss, instance);
	return instance;
    }
}
