package com.lvl.patterns.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class HotDrinkMachine {

    Map<String, HotDrinkFactory> namedFactories = new HashMap<>();

    public HotDrinkMachine() {
	try {
	    populateFactories();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private void populateFactories() throws Exception {

	Set<Class<? extends HotDrinkFactory>> types = new Reflections("com.lvl.patterns.factory.abstractfactory")
		.getSubTypesOf(HotDrinkFactory.class);

	for (Class<? extends HotDrinkFactory> type : types) {
	    namedFactories.put(type.getSimpleName().replace("Factory", ""),
		    (HotDrinkFactory) type.getDeclaredConstructors()[0].newInstance());
	}

    }

    public HotDrink makeDrink() throws Exception {
	System.out.println("Available drinks: ");
	for (String key : namedFactories.keySet()) {
	    System.out.println(key);
	}

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	while (true) {
	    String inputString, drink;
	    int amount;
	    System.out.println("Specify drink: ");
	    if ((inputString = reader.readLine()) != null && namedFactories.keySet().contains(inputString)) {
		drink = inputString;
		System.out.println("Specify amount: ");
		inputString = reader.readLine();
		if (inputString != null && (amount = Integer.parseInt(inputString)) > 0) {
		    return namedFactories.get(drink).prepare(amount);
		}
	    }
	    System.out.println("Incorrect input, try again!");
	}
    }

}
