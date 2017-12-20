package com.wxh.hibernate;

import java.sql.Timestamp;

/**
 * Mvd entity. @author MyEclipse Persistence Tools
 */

public class Mvd {

	// Fields

	private Integer id;
	private String category;
	private String info;
	private String creator;
	private Integer device;
	private Timestamp recorddate;
	private Boolean submitflag;
	private Timestamp occurdate;
	private String submitter;
	private Timestamp submitdate;

	// Constructors

	/** default constructor */
	public Mvd() {
	}

	/** full constructor */
	public Mvd(String category, String info, String creator, Integer device,
			Timestamp recorddate, Boolean submitflag, Timestamp occurdate,
			String submitter, Timestamp submitdate) {
		this.category = category;
		this.info = info;
		this.creator = creator;
		this.device = device;
		this.recorddate = recorddate;
		this.submitflag = submitflag;
		this.occurdate = occurdate;
		this.submitter = submitter;
		this.submitdate = submitdate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getDevice() {
		return this.device;
	}

	public void setDevice(Integer device) {
		this.device = device;
	}

	public Timestamp getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}

	public Boolean getSubmitflag() {
		return this.submitflag;
	}

	public void setSubmitflag(Boolean submitflag) {
		this.submitflag = submitflag;
	}

	public Timestamp getOccurdate() {
		return this.occurdate;
	}

	public void setOccurdate(Timestamp occurdate) {
		this.occurdate = occurdate;
	}

	public String getSubmitter() {
		return this.submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public Timestamp getSubmitdate() {
		return this.submitdate;
	}

	public void setSubmitdate(Timestamp submitdate) {
		this.submitdate = submitdate;
	}

}