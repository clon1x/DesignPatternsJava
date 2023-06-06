package com.lvl.patterns.factory;

public class Point {

	private double x, y;
	
	public enum CoordinateSystem {
		CARTESIAN, POLAR
	}
	
	/**
	 * Cartesian or polar coordinates
	 * @param a - x coordinate, or rho
	 * @param b - y coordinate, or theta
	 */
	public Point(double a, double b, CoordinateSystem cs) {
		switch (cs) {
			case CARTESIAN:
				this.x = a;
				this.y = b;
				break;
			
			case POLAR:
				this.x = a * Math.cos(b);
				this.y = a * Math.sin(b);
				break;
		}
	}
}
