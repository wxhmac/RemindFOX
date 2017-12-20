package com.wxh.action;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class MvdPack extends JqGridBaseAction<Map<String, Object>> {
	protected Integer recordId;
	protected String category;
	protected String info;
	protected Integer device;
	protected Timestamp recorddate;
	protected Boolean submitflag;
	protected Timestamp occurdate;

	// 额外封装数据项
	protected String myData;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getDevice() {
		return device;
	}

	public void setDevice(Integer device) {
		this.device = device;
	}

	public Timestamp getRecorddate() {
		return recorddate;
	}

	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}
	
	public Boolean getSubmitflag() {
		return submitflag;
	}

	public void setSubmitflag(Boolean submitflag) {
		this.submitflag = submitflag;
	}
	
	public Timestamp getOccurdate() {
		return occurdate;
	}

	public void setOccurdate(Timestamp occurdate) {
		this.occurdate = occurdate;
	}

	public String getMyData() {
		return myData;
	}

	public void setMyData(String myData) {
		this.myData = myData;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
