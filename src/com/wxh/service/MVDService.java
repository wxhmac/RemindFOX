package com.wxh.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wxh.hibernate.BaseDaoImpl;
import com.wxh.hibernate.Device;
import com.wxh.hibernate.Mvd;
import com.wxh.hibernate.Onduty;

public class MVDService {

	private static final Log logger = LogFactory.getLog(MVDService.class);

	// 定义数据库访问的Dao
	private BaseDaoImpl daoImpl;

	public BaseDaoImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(BaseDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	// 查询共有多少条维护记录
	public int queryMVDCounts(String hql) {
		try {
			int counts = Integer.parseInt(String.valueOf(this.daoImpl.findAll(
					hql, Mvd.class).get(0)));
			return counts;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// 查询维护记录详细内容
	public List<Map<String, Object>> getMVDList(int from, int length, String hql) {

		logger.info("查询维护记录！");

		List<Map<String, Object>> MVDList = new ArrayList<Map<String, Object>>();

		List<Mvd> records = this.daoImpl.findByPage(hql, Mvd.class, from,
				length);

		if (records == null) {
			return null;
		}

		for (int i = 0; i < records.size(); i++) {

			Mvd record = records.get(i);

			Map<String, Object> dataMap = new HashMap<String, Object>();

			dataMap.put("recordId", record.getId());
			dataMap.put("category", record.getCategory());
			dataMap.put("info", record.getInfo());
			dataMap.put("creator", record.getCreator());

			Device device = this.daoImpl.get(Device.class, record.getDevice());
			dataMap.put("device", device.getName());

			dataMap.put("occurdate", record.getOccurdate());
			dataMap.put("submitflag", record.getSubmitflag());

			MVDList.add(dataMap);
		}

		return MVDList;
	}

	// 2016-08-19 修改
	public Integer getDutyStatus(String userName) {
		
		String hql = "from Onduty where manonduty like '%" + userName + "%'";
		
		List<Onduty> dutyList = this.daoImpl.findAll(hql, Onduty.class);

		if (dutyList != null && dutyList.size() == 1) {
			Onduty ds = dutyList.get(0);
			return ds.getDutyschedule();
		} else {
			return -1;
		}
	}

	// 2016-07-22 新增 结束

	public String getDevices() {

		String devicesStr = "-1" + ":" + " ";

		try {
			String hql = "from Device";

			List<Device> deviceList = this.daoImpl.findAll(hql, Device.class);

			if (deviceList == null) {
				return null;
			}

			for (int i = 0; i < deviceList.size(); i++) {
				Device device = deviceList.get(i);
				devicesStr += ";" + device.getId() + ":" + device.getName();
			}

			return devicesStr;
		} catch (Exception e) {
			return null;
		}
	}
}
