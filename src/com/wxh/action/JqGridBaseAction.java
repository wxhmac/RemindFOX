package com.wxh.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.wxh.action.Criterion.CompareType;

@SuppressWarnings("serial")
public abstract class JqGridBaseAction<T> extends ActionBase {

	// private static final Log logger =
	// LogFactory.getLog(JqGridBaseAction.class);

	// 用于与JQGrid对应的相关参数
	private List<T> gridModel = Collections.emptyList();
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer record = 0;
	private String sord;
	public String sidx;
	private String filters;

	// 定义和查询相关的参数，是否是查询search，查询域searchField，查询内容searchString及查询操作searchOper，即是包含还是或操作
	private boolean search;
	private String searchField;
	private String searchString;
	private String searchOper;

	public abstract int getResultSize();

	public abstract List<T> listResults(int from, int length);

	// 定义抽象类方法用于继承者实现
	public abstract int getResultSize(List<Criterion> criteria);

	public abstract List<T> listResults(List<Criterion> criteria, int from,
			int length);

	public String refreshGridModel() {
		try {
			List<Criterion> criteria = Collections.emptyList();

			if (search == true) {
				criteria = new ArrayList<Criterion>();

				// 将组合查询条件进行解析，主要是对json格式字符串的解析
				if (filters != null && filters.length() > 0) {
					criteria.addAll(this
							.generateSearchCriteriaFromFilters(filters));
				}

				// (3)将searchField、searchString、searchOper转化为Criterion，并加入总的Criterion列表
				Criterion criterion = this.generateSearchCriterion(searchField,
						searchString, searchOper);
				if (criterion != null) {
					criteria.add(criterion);
				}
			}

			int from = rows * (page - 1);
			int length = rows;

			List<T> results = Collections.emptyList();

			if (!criteria.isEmpty()) {
				results = this.listResults(criteria, from, length);
				record = this.getResultSize(criteria);
			} else {
				results = this.listResults(from, length);
				record = this.getResultSize();
			}

			this.setGridModel(results);
			total = (int) Math.ceil((double) record / (double) rows);
			return "showdata";
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(e.getMessage());
			return ERROR;
		}
	}

	public Criterion generateSearchCriterion(String searchField,
			String searchString, String searchOper) {
		Criterion criterion = null;

		// 如果searchField、searchString、searchOper均不为null，且searchString不为空字符串时，则创建Criterion
		if (searchField != null && searchString != null
				& searchString.length() > 0 && searchOper != null) {
			if ("eq".equals(searchOper)) {
				criterion = Criterion.getEqualCriterion(searchField,
						searchString, null);
			} else if ("ne".equals(searchOper)) {
				criterion = Criterion.getCompareCriterion(CompareType.NE,
						searchField, searchString, null);
			} else if ("lt".equals(searchOper)) {
				criterion = Criterion.getCompareCriterion(CompareType.LT,
						searchField, searchString, null);
			} else if ("le".equals(searchOper)) {
				criterion = Criterion.getCompareCriterion(CompareType.LTE,
						searchField, searchString, null);
			} else if ("gt".equals(searchOper)) {
				criterion = Criterion.getCompareCriterion(CompareType.GT,
						searchField, searchString, null);
			} else if ("ge".equals(searchOper)) {
				criterion = Criterion.getCompareCriterion(CompareType.GTE,
						searchField, searchString, null);
			} else if ("bw".equals(searchOper)) {
				criterion = Criterion.getLikeCriterion(searchField,
						searchString + "%", null);
			} else if ("bn".equals(searchOper)) {
				criterion = Criterion.getNotLikeCriterion(searchField,
						searchString + "%", null);
			} else if ("ew".equals(searchOper)) {
				criterion = Criterion.getLikeCriterion(searchField, "%"
						+ searchString, null);
			} else if ("en".equals(searchOper)) {
				criterion = Criterion.getNotLikeCriterion(searchField, "%"
						+ searchString, null);
			} else if ("cn".equals(searchOper)) {
				criterion = Criterion.getLikeCriterion(searchField, "%"
						+ searchString + "%", null);
			} else if ("nc".equals(searchOper)) {
				criterion = Criterion.getNotLikeCriterion(searchField, "%"
						+ searchString + "%", null);
			}
		}
		return criterion;
	}

	public List<Criterion> generateSearchCriteriaFromFilters(String filters) {
		List<Criterion> criteria = new ArrayList<Criterion>();

		JSONObject jsonObject = JSONObject.fromObject(filters);

		// logger.info("查询的json数据是："+ filters);
		// logger.info("查询的组合方式是："+ jsonObject.get("groupOp"));
		Criterion.setGroupOp(" " + jsonObject.get("groupOp") + " ");

		JSONArray rules = jsonObject.getJSONArray("rules");

		for (Object obj : rules) {
			JSONObject rule = (JSONObject) obj;

			String field = rule.getString("field");
			String op = rule.getString("op");
			String data = rule.getString("data");

			Criterion criterion = this.generateSearchCriterion(field, data, op);

			if (criterion != null) {
				criteria.add(criterion);
			}
		}

		return criteria;
	}

	public List<T> getGridModel() {
		return gridModel;
	}

	public void setGridModel(List<T> gridModel) {
		this.gridModel = gridModel;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecord() {
		return record;
	}

	public void setRecord(Integer record) {
		this.record = record;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public boolean isSearch() {
		return search;
	}

	public void setSearch(boolean search) {
		this.search = search;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getSearchOper() {
		return searchOper;
	}

	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}
}
