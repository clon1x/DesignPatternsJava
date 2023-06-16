package com.lvl.patterns.prototype;

public class Address {

	public String streetName;
	public int houseNumber;
	public String city;
	public String country;
	
	
	public Address(String streetName, int houseNumber, String city, String country) {
		super();
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;
	}
	
	public Address(Address other) {
		this(other.streetName, other.houseNumber, other.city, other.country);
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + ", city=" + city + ", country="
				+ country + "]";
	}
	
}
