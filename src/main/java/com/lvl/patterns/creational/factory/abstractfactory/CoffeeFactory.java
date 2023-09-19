package com.lvl.patterns.creational.factory.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Grind some beans, boil water, pour " + amount + "ml, add cream and sugar... Enjoy!");
		return new Coffee();

	}

}
