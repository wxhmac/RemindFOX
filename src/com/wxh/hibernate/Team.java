package com.wxh.hibernate;

/**
 * Team entity. @author MyEclipse Persistence Tools
 */

public class Team {

	// Fields

	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public Team() {
	}

	/** minimal constructor */
	public Team(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Team(Integer id, String name) {
		this.id = id;
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