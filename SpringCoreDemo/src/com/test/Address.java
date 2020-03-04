package com.test;

public class Address {
	
	String city;
	String country;
	public Address(String city, String country) {
		
		this.city = city;
		this.country = country;
	}
	public String toString() {
		return "Address:"+city+" "+country;
		
		
	}

}
