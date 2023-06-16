package com.lvl.patterns.prototype;

public class Address {

	public String streetName;
	public int houseNumber;
	
	public Address(String streetName, int houseNumber) {
		super();
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
	}
	
}
