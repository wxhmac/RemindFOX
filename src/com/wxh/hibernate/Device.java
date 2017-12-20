package com.wxh.hibernate;

/**
 * Device entity. @author MyEclipse Persistence Tools
 */

public class Device {

	// Fields

	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public Device() {
	}

	/** full constructor */
	public Device(String name) {
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}