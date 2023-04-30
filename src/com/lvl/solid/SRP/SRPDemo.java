package com.lvl.solid.SRP;

import java.io.FileNotFoundException;

public class SRPDemo {

	public static void main(String[] args) throws FileNotFoundException {
		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I ate a bug");
		
		System.out.println(j);
		
		JournalPersistance persistance = new JournalPersistance(j);
		persistance.save("myJournal.txt");
	}

}
