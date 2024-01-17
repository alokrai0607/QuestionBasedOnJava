package com.javaexamples.oops.abstraction.encapsulation;

public class Encapsulation {

	private Integer id;
	private String name; // Corrected the variable name to follow Java naming conventions
	private String address;

	public Encapsulation() {
		super();
	}

	public Encapsulation(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name; // Updated variable name
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Encapsulation [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
