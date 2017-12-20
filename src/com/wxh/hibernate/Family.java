package com.wxh.hibernate;

/**
 * Family entity. @author MyEclipse Persistence Tools
 */

public class Family {

	// Fields

	private Integer id;
	private String name;
	private String team;
	private String password;
	private String privilege;

	// Constructors

	/** default constructor */
	public Family() {
	}

	/** full constructor */
	public Family(String name, String team, String password, String privilege) {
		this.name = name;
		this.team = team;
		this.password = password;
		this.privilege = privilege;
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

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

}