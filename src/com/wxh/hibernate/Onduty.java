package com.wxh.hibernate;

/**
 * Onduty entity. @author MyEclipse Persistence Tools
 */

public class Onduty {

	// Fields

	private Integer id;
	private Integer dutyschedule;
	private String team;
	private String manonduty;

	// Constructors

	/** default constructor */
	public Onduty() {
	}

	/** full constructor */
	public Onduty(Integer dutyschedule, String team, String manonduty) {
		this.dutyschedule = dutyschedule;
		this.team = team;
		this.manonduty = manonduty;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDutyschedule() {
		return this.dutyschedule;
	}

	public void setDutyschedule(Integer dutyschedule) {
		this.dutyschedule = dutyschedule;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getManonduty() {
		return this.manonduty;
	}

	public void setManonduty(String manonduty) {
		this.manonduty = manonduty;
	}

}