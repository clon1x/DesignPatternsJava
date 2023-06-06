package com.lvl.patterns.factory.clients;

import com.lvl.patterns.factory.Point;

public class PointDemo {

	public static void main(String[] args) {

		Point a = Point.Factory.newCartesianPoint(3, 4);
		
		double theta = 0.92729521800161223242851246292243;
		Point b = Point.Factory.newPolarPoint(5, theta);

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
