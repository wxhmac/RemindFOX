package com.wxh.action;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.wxh.service.PlanService;

@SuppressWarnings("serial")
public class PlanQueryAction extends PlanPack {

	private PlanService pService;

	public PlanQueryAction() {
	}

	public int getResultSize() {
		String hql = "select count(*) from Plan where executeflag = '1' and finishflag='0'";
		return this.pService.queryPlanCounts(hql);
	}

	public List<Map<String, Object>> listResults(int from, int length) {
		String hql = "from Plan where executeflag = '1' and finishflag='0'";

		if (sidx != null && !sidx.equals("") && !sidx.equals("recorddate")) {
			hql += " order by " + sidx;
		} else {
			hql += " order by recorddate desc";
		}

		List<Map<String, Object>> results = Collections.emptyList();

		results = this.pService.getPlanList(from, length, hql);
		return results;
	}

	public String queryPlans() {
		return this.refreshGridModel();
	}

	public PlanService getpService() {
		return pService;
	}

	public void setpService(PlanService pService) {
		this.pService = pService;
	}
}
