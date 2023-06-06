package com.lvl.patterns.factory;

public class Point {

	private double x, y;
	
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static class Factory {
		
		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}
		
		public static Point newPolarPoint(double rho, double theta) {
			return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
		}

	}	
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRho() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double getTheta() {
		return Math.atan2(y, x);
	}
	
	public String toString(int precision) {
		double pot10 = Math.pow(10,precision);
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(Math.round(x * pot10) / pot10);
		builder.append(", y=");
		builder.append(Math.round(y * pot10) / pot10);
		builder.append("]");
		return builder.toString();		
	}

	@Override
	public String toString() {
		return toString(18);
	}
	
	
	
}
