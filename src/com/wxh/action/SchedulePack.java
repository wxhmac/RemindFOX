package com.wxh.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Dutyschedule entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class SchedulePack extends JqGridBaseAction<Map<String, Object>> {

	// Fields

	protected Integer recordId;
	protected Date date;
	protected String name;
	protected String team;
	protected String daynight;

	// 额外封装数据项
	protected String userName;
	protected String myData;

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

	// Property accessors

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMyData() {
		return myData;
	}

	public void setMyData(String myData) {
		this.myData = myData;
	}
}