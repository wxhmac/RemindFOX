package com.wxh.action;

import java.util.List;
import java.util.Map;

import com.wxh.service.PlanService;

@SuppressWarnings("serial")
public class OndutyPlanAction extends PlanPack {

	private PlanService pService;

	public OndutyPlanAction() {
	}

	public int getResultSize() {
		return this.pService.getDutyPlanCounts();
	}

	public List<Map<String, Object>> listResults(int from, int length) {
		return this.pService.getPlanListByDuty(from,length);

	}

	public String queryDutyPlans() {
		return this.refreshGridModel();
	}

	public PlanService getpService() {
		return pService;
	}

	public void setpService(PlanService pService) {
		this.pService = pService;
	}
}
