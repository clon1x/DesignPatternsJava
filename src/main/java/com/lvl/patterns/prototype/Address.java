package com.lvl.patterns.prototype;

public class Address implements Cloneable {

	public String streetName;
	public int houseNumber;
	
	public Address(String streetName, int houseNumber) {
		super();
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return new Address(streetName, houseNumber);
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
	}
	
}
