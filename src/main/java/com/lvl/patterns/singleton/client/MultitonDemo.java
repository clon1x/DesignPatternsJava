package com.lvl.patterns.singleton.client;

import com.lvl.patterns.singleton.multiton.Printer;
import com.lvl.patterns.singleton.multiton.Subsystem;

public class MultitonDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	System.out.println("Creating variable main for PRIMARY printer...");
	Printer main = Printer.get(Subsystem.PRIMARY);
	System.out.println("Creating variable aux for AUXILIARY printer...");
	Printer aux = Printer.get(Subsystem.AUXILIARY);
	System.out.println("Creating variable aux2 for AUXILIARY printer...");
	Printer aux2 = Printer.get(Subsystem.AUXILIARY);
    }
}
