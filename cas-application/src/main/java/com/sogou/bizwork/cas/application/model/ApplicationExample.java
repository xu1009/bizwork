package com.sogou.bizwork.cas.application.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplicationExample implements Serializable{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public ApplicationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andAppIdIsNull() {
			addCriterion("appid is null");
			return (Criteria) this;
		}

		public Criteria andAppIdIsNotNull() {
			addCriterion("appid is not null");
			return (Criteria) this;
		}

		public Criteria andAppIdEqualTo(Integer value) {
			addCriterion("appid =", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotEqualTo(Integer value) {
			addCriterion("appid <>", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdGreaterThan(Integer value) {
			addCriterion("appid >", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("appid >=", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdLessThan(Integer value) {
			addCriterion("appid <", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdLessThanOrEqualTo(Integer value) {
			addCriterion("appid <=", value, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdIn(List<Integer> values) {
			addCriterion("appid in", values, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotIn(List<Integer> values) {
			addCriterion("appid not in", values, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdBetween(Integer value1, Integer value2) {
			addCriterion("appid between", value1, value2, "appId");
			return (Criteria) this;
		}

		public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
			addCriterion("appid not between", value1, value2, "appId");
			return (Criteria) this;
		}

		public Criteria andServiceIdIsNull() {
			addCriterion("serviceid is null");
			return (Criteria) this;
		}

		public Criteria andServiceIdIsNotNull() {
			addCriterion("serviceid is not null");
			return (Criteria) this;
		}

		public Criteria andServiceIdEqualTo(String value) {
			addCriterion("serviceid =", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotEqualTo(String value) {
			addCriterion("serviceid <>", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThan(String value) {
			addCriterion("serviceid >", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
			addCriterion("serviceid >=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThan(String value) {
			addCriterion("serviceid <", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThanOrEqualTo(String value) {
			addCriterion("serviceid <=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLike(String value) {
			addCriterion("serviceid like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotLike(String value) {
			addCriterion("serviceid not like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdIn(List<String> values) {
			addCriterion("serviceid in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotIn(List<String> values) {
			addCriterion("serviceid not in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdBetween(String value1, String value2) {
			addCriterion("serviceid between", value1, value2, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotBetween(String value1, String value2) {
			addCriterion("serviceid not between", value1, value2, "serviceId");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledIsNull() {
			addCriterion("ssoenabled is null");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledIsNotNull() {
			addCriterion("ssoenabled is not null");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledEqualTo(Integer value) {
			addCriterion("ssoenabled =", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledNotEqualTo(Integer value) {
			addCriterion("ssoenabled <>", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledGreaterThan(Integer value) {
			addCriterion("ssoenabled >", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledGreaterThanOrEqualTo(Integer value) {
			addCriterion("ssoenabled >=", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledLessThan(Integer value) {
			addCriterion("ssoenabled <", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledLessThanOrEqualTo(Integer value) {
			addCriterion("ssoenabled <=", value, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledIn(List<Integer> values) {
			addCriterion("ssoenabled in", values, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledNotIn(List<Integer> values) {
			addCriterion("ssoenabled not in", values, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledBetween(Integer value1, Integer value2) {
			addCriterion("ssoenabled between", value1, value2, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andSsoEnabledNotBetween(Integer value1, Integer value2) {
			addCriterion("ssoenabled not between", value1, value2, "ssoEnabled");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2,
					"description");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("createdate is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("createdate is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(Date value) {
			addCriterionForJDBCDate("createdate =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("createdate <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(Date value) {
			addCriterionForJDBCDate("createdate >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("createdate >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(Date value) {
			addCriterionForJDBCDate("createdate <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("createdate <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<Date> values) {
			addCriterionForJDBCDate("createdate in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("createdate not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("createdate between", value1, value2,
					"createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("createdate not between", value1, value2,
					"createDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateIsNull() {
			addCriterion("changedate is null");
			return (Criteria) this;
		}

		public Criteria andChangeDateIsNotNull() {
			addCriterion("changedate is not null");
			return (Criteria) this;
		}

		public Criteria andChangeDateEqualTo(Date value) {
			addCriterionForJDBCDate("changedate =", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("changedate <>", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateGreaterThan(Date value) {
			addCriterionForJDBCDate("changedate >", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("changedate >=", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateLessThan(Date value) {
			addCriterionForJDBCDate("changedate <", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("changedate <=", value, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateIn(List<Date> values) {
			addCriterionForJDBCDate("changedate in", values, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("changedate not in", values, "changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("changedate between", value1, value2,
					"changeDate");
			return (Criteria) this;
		}

		public Criteria andChangeDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("changedate not between", value1, value2,
					"changeDate");
			return (Criteria) this;
		}

		public Criteria andUserSourceIsNull() {
			addCriterion("usersource is null");
			return (Criteria) this;
		}

		public Criteria andUserSourceIsNotNull() {
			addCriterion("usersource is not null");
			return (Criteria) this;
		}

		public Criteria andUserSourceEqualTo(Integer value) {
			addCriterion("usersource =", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceNotEqualTo(Integer value) {
			addCriterion("usersource <>", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceGreaterThan(Integer value) {
			addCriterion("usersource >", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceGreaterThanOrEqualTo(Integer value) {
			addCriterion("usersource >=", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceLessThan(Integer value) {
			addCriterion("usersource <", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceLessThanOrEqualTo(Integer value) {
			addCriterion("usersource <=", value, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceIn(List<Integer> values) {
			addCriterion("usersource in", values, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceNotIn(List<Integer> values) {
			addCriterion("usersource not in", values, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceBetween(Integer value1, Integer value2) {
			addCriterion("usersource between", value1, value2, "userSource");
			return (Criteria) this;
		}

		public Criteria andUserSourceNotBetween(Integer value1, Integer value2) {
			addCriterion("usersource not between", value1, value2, "userSource");
			return (Criteria) this;
		}

		public Criteria andIntraneturlIsNull() {
			addCriterion("intraneturl is null");
			return (Criteria) this;
		}

		public Criteria andIntraneturlIsNotNull() {
			addCriterion("intraneturl is not null");
			return (Criteria) this;
		}

		public Criteria andIntraneturlEqualTo(String value) {
			addCriterion("intraneturl =", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlNotEqualTo(String value) {
			addCriterion("intraneturl <>", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlGreaterThan(String value) {
			addCriterion("intraneturl >", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlGreaterThanOrEqualTo(String value) {
			addCriterion("intraneturl >=", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlLessThan(String value) {
			addCriterion("intraneturl <", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlLessThanOrEqualTo(String value) {
			addCriterion("intraneturl <=", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlLike(String value) {
			addCriterion("intraneturl like", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlNotLike(String value) {
			addCriterion("intraneturl not like", value, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlIn(List<String> values) {
			addCriterion("intraneturl in", values, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlNotIn(List<String> values) {
			addCriterion("intraneturl not in", values, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlBetween(String value1, String value2) {
			addCriterion("intraneturl between", value1, value2, "intraneturl");
			return (Criteria) this;
		}

		public Criteria andIntraneturlNotBetween(String value1, String value2) {
			addCriterion("intraneturl not between", value1, value2,
					"intraneturl");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table uuc_application
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table uuc_application
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}