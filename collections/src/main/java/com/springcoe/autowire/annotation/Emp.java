 package com.springcoe.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	@Autowired
      private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address){
		System.out.println("Inside setter method");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Inside construtor method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}     
}