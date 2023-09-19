package com.lvl.patterns.creational.factory.clients;

import com.lvl.patterns.creational.factory.Point;
import com.lvl.patterns.creational.factory.PointFactory;

public class PointDemo {

	public static void main(String[] args) {

		Point a = PointFactory.newCartesianPoint(3, 4);
		
		double theta = 0.92729521800161223242851246292243;
		Point b = PointFactory.newPolarPoint(5, theta);

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
