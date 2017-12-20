package com.wxh.hibernate;

import java.sql.Timestamp;

/**
 * Plan entity. @author MyEclipse Persistence Tools
 */

public class Plan {

	// Fields

	private Integer id;
	private String creator;
	private Timestamp plandateStart;
	private Timestamp plandateEnd;
	private Boolean finishflag;
	private Timestamp recorddate;
	private Timestamp finishdate;
	private String members;
	private String info;
	private String finishdescription;
	private Boolean executeflag;

	// Constructors

	/** default constructor */
	public Plan() {
	}

	/** full constructor */
	public Plan(String creator, Timestamp plandateStart, Timestamp plandateEnd,
			Boolean finishflag, Timestamp recorddate, Timestamp finishdate,
			String members, String info, String finishdescription,
			Boolean executeflag) {
		this.creator = creator;
		this.plandateStart = plandateStart;
		this.plandateEnd = plandateEnd;
		this.finishflag = finishflag;
		this.recorddate = recorddate;
		this.finishdate = finishdate;
		this.members = members;
		this.info = info;
		this.finishdescription = finishdescription;
		this.executeflag = executeflag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getPlandateStart() {
		return this.plandateStart;
	}

	public void setPlandateStart(Timestamp plandateStart) {
		this.plandateStart = plandateStart;
	}

	public Timestamp getPlandateEnd() {
		return this.plandateEnd;
	}

	public void setPlandateEnd(Timestamp plandateEnd) {
		this.plandateEnd = plandateEnd;
	}

	public Boolean getFinishflag() {
		return this.finishflag;
	}

	public void setFinishflag(Boolean finishflag) {
		this.finishflag = finishflag;
	}

	public Timestamp getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}

	public Timestamp getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(Timestamp finishdate) {
		this.finishdate = finishdate;
	}

	public String getMembers() {
		return this.members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getFinishdescription() {
		return this.finishdescription;
	}

	public void setFinishdescription(String finishdescription) {
		this.finishdescription = finishdescription;
	}

	public Boolean getExecuteflag() {
		return this.executeflag;
	}

	public void setExecuteflag(Boolean executeflag) {
		this.executeflag = executeflag;
	}

}