package com.lvl.solid.srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class JournalPersistance {

	private Journal journal;

	public JournalPersistance(Journal journal) {
		super();
		this.journal = journal;
	}

	public void save(String filename) throws FileNotFoundException {
		try (PrintStream out = new PrintStream(filename)) {
			out.println(journal.toString());
		}
	}

	public void load(String filename) throws FileNotFoundException {}

	public void load(URL url) {}
	
	
	
}
