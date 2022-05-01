package com.example.demo.controller;

public class Person {
	
	private Integer id;
	
	private String name;
	
	private String addr;
	
	private String designation;

	public Person() {
		
	}

	public Person(Integer id, String name, String addr, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.designation = designation;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
