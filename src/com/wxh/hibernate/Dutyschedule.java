package com.wxh.hibernate;

import java.util.Date;

/**
 * Dutyschedule entity. @author MyEclipse Persistence Tools
 */

public class Dutyschedule {

	// Fields

	private Integer id;
	private Date date;
	private String name;
	private String team;
	private String daynight;
	private Boolean onduty;

	// Constructors

	/** default constructor */
	public Dutyschedule() {
	}

	/** full constructor */
	public Dutyschedule(Date date, String name, String team, String daynight,
			Boolean onduty) {
		this.date = date;
		this.name = name;
		this.team = team;
		this.daynight = daynight;
		this.onduty = onduty;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public String getDaynight() {
		return this.daynight;
	}

	public void setDaynight(String daynight) {
		this.daynight = daynight;
	}

	public Boolean getOnduty() {
		return this.onduty;
	}

	public void setOnduty(Boolean onduty) {
		this.onduty = onduty;
	}

}