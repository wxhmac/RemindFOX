package com.wxh.action;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.wxh.service.MVDService;

@SuppressWarnings("serial")
public class MaintenanceAction extends MvdPack {

	private MVDService mService;

	public MaintenanceAction() {
	}

	public int getResultSize() {
		String hql = "select count(*) from Mvd where submitflag = '0'";
		return this.mService.queryMVDCounts(hql);
	}

	public int getResultSize(List<Criterion> criteria) {
		String hql = "select count(*) from Mvd where submitflag = '0' and "
				+ Criterion.convertToHql(criteria);
		return this.mService.queryMVDCounts(hql);
	}

	public List<Map<String, Object>> listResults(int from, int length) {

		String hql = "from Mvd where submitflag = '0'";

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

		String hql = "from Mvd where submitflag = '0' and "
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

	public String getRecords() {
		return this.refreshGridModel();
	}

	public MVDService getmService() {
		return mService;
	}

	public void setmService(MVDService mService) {
		this.mService = mService;
	}
}
