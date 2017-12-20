package com.wxh.action;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.wxh.service.MVDService;

@SuppressWarnings("serial")
public class QueryAction extends MvdPack {

	private MVDService mService;

	public QueryAction() {
	}

	public int getResultSize() {
		String hql = "select count(*) from Mvd where submitflag = '1'";
		return this.mService.queryMVDCounts(hql);
	}

	public int getResultSize(List<Criterion> criteria) {
		String hql = "select count(*) from Mvd where submitflag = '1' and "
				+ Criterion.convertToHql(criteria);
		return this.mService.queryMVDCounts(hql);
	}

	public List<Map<String, Object>> listResults(int from, int length) {

		String hql = "from Mvd where submitflag = '1'";

		if (sidx != null && !sidx.equals("") && !sidx.equals("recorddate")) {
			hql += " order by " + sidx;
		} else {
			hql += " order by recorddate desc";
		}

		List<Map<String, Object>> results = Collections.emptyList();

		results = this.mService.getMVDList(from, length, hql);
		return results;
	}

	public List<Map<String, Object>> listResults(List<Criterion> criteria,
			int from, int length) {

		String hql = "from Mvd where submitflag = '1' and "
				+ Criterion.convertToHql(criteria);

		if (sidx != null && !sidx.equals("") && !sidx.equals("recorddate")) {
			hql += " order by " + sidx;
		} else {
			hql += " order by recorddate desc";
		}

		List<Map<String, Object>> results = Collections.emptyList();

		results = this.mService.getMVDList(from, length, hql);
		return results;
	}

	public String queryRecords() {
		return this.refreshGridModel();
	}

	public MVDService getmService() {
		return mService;
	}

	public void setmService(MVDService mService) {
		this.mService = mService;
	}

	public String getMyData() {

		Map<String, Object> dataMap = new HashMap<String, Object>();

		dataMap.put("devices", mService.getDevices());
		dataMap.put("permission", "yes");

		JSONObject json = JSONObject.fromObject(dataMap);
		myData = json.toString();

		return myData;
	}
}
