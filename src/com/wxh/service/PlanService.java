package com.wxh.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wxh.hibernate.BaseDaoImpl;
import com.wxh.hibernate.Mvd;
import com.wxh.hibernate.Onduty;
import com.wxh.hibernate.Plan;

public class PlanService {

	private static final Log logger = LogFactory.getLog(PlanService.class);

	// 定义数据库访问的Dao
	private BaseDaoImpl daoImpl;

	public BaseDaoImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(BaseDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	// 查询共有多少条工作计划
	public int queryPlanCounts(String hql) {
		try {
			int counts = Integer.parseInt(String.valueOf(this.daoImpl.findAll(
					hql, Mvd.class).get(0)));
			return counts;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// 查询工作计划
	public List<Map<String, Object>> getPlanList(int from, int length,
			String hql) {

		logger.info("查询工作计划！");

		List<Map<String, Object>> PlanList = new ArrayList<Map<String, Object>>();

		List<Plan> records = this.daoImpl.findByPage(hql, Plan.class, from,
				length);

		if (records == null) {
			return null;
		}

		for (int i = 0; i < records.size(); i++) {

			Plan record = records.get(i);

			Map<String, Object> dataMap = new HashMap<String, Object>();

			dataMap.put("recordId", record.getId());
			dataMap.put("info", record.getInfo());
			dataMap.put("members", record.getMembers());
			dataMap.put("plandateEnd", record.getPlandateEnd());
			dataMap.put("finishdescription", record.getFinishdescription());

			PlanList.add(dataMap);
		}

		return PlanList;
	}

	// 查询共有多少条工作计划
	public int getDutyPlanCounts() {

		String hql = "from Onduty";

		List<Onduty> records = this.daoImpl.findAll(hql, Onduty.class);

		if (records == null) {
			return 0;
		}

		hql = "select distinct p from Plan p where p.executeflag = '1' and p.finishflag='0' and ( p.members like '%";

		for (int i = 0; i < records.size(); i++) {
			Onduty duty = records.get(i);
			String[] works = duty.getManonduty().split(" ");

			if (i == 0) {
				hql += works[0] + "%'";
				for (int k = 1; k < works.length; k++) {
					hql += " or p.members like '%" + works[k] + "%'";
				}
			} else {
				for (int k = 0; k < works.length; k++) {
					hql += " or p.members like '%" + works[k] + "%'";
				}
			}

		}

		hql += ")";

		List<Plan> plans = this.daoImpl.findAll(hql, Plan.class);

		if (plans == null) {
			return 0;
		}

		return plans.size();
	}

	public List<Map<String, Object>> getPlanListByDuty(int from, int length) {

		String hql = "from Onduty";

		List<Onduty> records = this.daoImpl.findAll(hql, Onduty.class);

		if (records == null) {
			return null;
		}

		List<Map<String, Object>> PlanList = new ArrayList<Map<String, Object>>();

		hql = "select distinct p from Plan p where p.executeflag = '1' and p.finishflag='0' and ( p.members like '%";

		for (int i = 0; i < records.size(); i++) {
			Onduty duty = records.get(i);
			String[] works = duty.getManonduty().split(" ");

			if (i == 0) {
				hql += works[0] + "%'";
				for (int k = 1; k < works.length; k++) {
					hql += " or p.members like '%" + works[k] + "%'";
				}
			} else {
				for (int k = 0; k < works.length; k++) {
					hql += " or p.members like '%" + works[k] + "%'";
				}
			}

		}

		hql += ")";

		List<Plan> plans = this.daoImpl.findByPage(hql, Plan.class, from,
				length);

		if (plans == null) {
			return null;
		}

		for (int j = 0; j < plans.size(); j++) {

			Plan record = plans.get(j);
			Map<String, Object> dataMap = new HashMap<String, Object>();

			dataMap.put("recordId", record.getId());
			dataMap.put("info", record.getInfo());
			dataMap.put("members", record.getMembers());
			dataMap.put("plandateEnd", record.getPlandateEnd());
			dataMap.put("finishdescription", record.getFinishdescription());

			PlanList.add(dataMap);
		}

		return PlanList;
	}
}
