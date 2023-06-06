package com.lvl.patterns.factory.clients;

import com.lvl.patterns.factory.abstractfactory.HotDrink;
import com.lvl.patterns.factory.abstractfactory.HotDrinkMachine;

public class AbstractFactoryDemo {

	public static void main(String[] args) throws Exception {
		
		HotDrinkMachine machine = new HotDrinkMachine();
		HotDrink drink = machine.makeDrink();
		drink.consume();
		
	}

}
