package com.wxh.hibernate;

/**
 * MvdDutyschedule entity. @author MyEclipse Persistence Tools
 */

public class MvdDutyschedule {

	// Fields

	private Integer id;
	private Integer dutyschedule;
	private Integer mvd;

	// Constructors

	/** default constructor */
	public MvdDutyschedule() {
	}

	/** full constructor */
	public MvdDutyschedule(Integer dutyschedule, Integer mvd) {
		this.dutyschedule = dutyschedule;
		this.mvd = mvd;
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

	public Integer getMvd() {
		return this.mvd;
	}

	public void setMvd(Integer mvd) {
		this.mvd = mvd;
	}

}