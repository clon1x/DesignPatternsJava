package com.lvl.patterns.factory;

public class Point {

	private double x, y;
	
	/**
	 * Cartesian coordinates
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Polar coordinates
	 * @param rho
	 * @param theta
	 */
	public Point(double rho, double theta) {
		x = rho * Math.cos(theta);
		y = rho * Math.sin(theta);
	}
}
