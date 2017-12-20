package com.wxh.action;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Plan entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PlanPack extends JqGridBaseAction<Map<String, Object>>{

	// Fields

	protected Integer recordId;
	protected String creator;
	protected Timestamp plandateStart;
	protected Timestamp plandateEnd;
	protected Boolean finishflag;
	protected Timestamp recorddate;
	protected Timestamp finishdate;
	protected String members;
	protected String info;
	protected String finishdescription;
	protected Boolean executeflag;

	// Property accessors

	// 额外封装数据项
	protected String userName;

	public int getResultSize() {
		return 0;
	}

	public int getResultSize(List<Criterion> criteria) {
		return 0;
	}

	public List<Map<String, Object>> listResults(int from, int length) {
		return null;
	}

	public List<Map<String, Object>> listResults(List<Criterion> criteria,
			int from, int length) {
		return null;
	}
	
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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
		return members;
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
		return executeflag;
	}

	public void setExecuteflag(Boolean executeflag) {
		this.executeflag = executeflag;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}