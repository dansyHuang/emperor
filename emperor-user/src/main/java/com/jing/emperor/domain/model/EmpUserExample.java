package com.jing.emperor.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public EmpUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
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

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIsNull() {
			addCriterion("gmt_create is null");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIsNotNull() {
			addCriterion("gmt_create is not null");
			return (Criteria) this;
		}

		public Criteria andGmtCreateEqualTo(Date value) {
			addCriterion("gmt_create =", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotEqualTo(Date value) {
			addCriterion("gmt_create <>", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateGreaterThan(Date value) {
			addCriterion("gmt_create >", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_create >=", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateLessThan(Date value) {
			addCriterion("gmt_create <", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
			addCriterion("gmt_create <=", value, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateIn(List<Date> values) {
			addCriterion("gmt_create in", values, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotIn(List<Date> values) {
			addCriterion("gmt_create not in", values, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateBetween(Date value1, Date value2) {
			addCriterion("gmt_create between", value1, value2, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
			addCriterion("gmt_create not between", value1, value2, "gmtCreate");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIsNull() {
			addCriterion("gmt_modified is null");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIsNotNull() {
			addCriterion("gmt_modified is not null");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedEqualTo(Date value) {
			addCriterion("gmt_modified =", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotEqualTo(Date value) {
			addCriterion("gmt_modified <>", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedGreaterThan(Date value) {
			addCriterion("gmt_modified >", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_modified >=", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedLessThan(Date value) {
			addCriterion("gmt_modified <", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
			addCriterion("gmt_modified <=", value, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedIn(List<Date> values) {
			addCriterion("gmt_modified in", values, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotIn(List<Date> values) {
			addCriterion("gmt_modified not in", values, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedBetween(Date value1, Date value2) {
			addCriterion("gmt_modified between", value1, value2, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
			addCriterion("gmt_modified not between", value1, value2, "gmtModified");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNull() {
			addCriterion("creator is null");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNotNull() {
			addCriterion("creator is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorEqualTo(String value) {
			addCriterion("creator =", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotEqualTo(String value) {
			addCriterion("creator <>", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThan(String value) {
			addCriterion("creator >", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThanOrEqualTo(String value) {
			addCriterion("creator >=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThan(String value) {
			addCriterion("creator <", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThanOrEqualTo(String value) {
			addCriterion("creator <=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLike(String value) {
			addCriterion("creator like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotLike(String value) {
			addCriterion("creator not like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorIn(List<String> values) {
			addCriterion("creator in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotIn(List<String> values) {
			addCriterion("creator not in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorBetween(String value1, String value2) {
			addCriterion("creator between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotBetween(String value1, String value2) {
			addCriterion("creator not between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andModifierIsNull() {
			addCriterion("modifier is null");
			return (Criteria) this;
		}

		public Criteria andModifierIsNotNull() {
			addCriterion("modifier is not null");
			return (Criteria) this;
		}

		public Criteria andModifierEqualTo(String value) {
			addCriterion("modifier =", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierNotEqualTo(String value) {
			addCriterion("modifier <>", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierGreaterThan(String value) {
			addCriterion("modifier >", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierGreaterThanOrEqualTo(String value) {
			addCriterion("modifier >=", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierLessThan(String value) {
			addCriterion("modifier <", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierLessThanOrEqualTo(String value) {
			addCriterion("modifier <=", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierLike(String value) {
			addCriterion("modifier like", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierNotLike(String value) {
			addCriterion("modifier not like", value, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierIn(List<String> values) {
			addCriterion("modifier in", values, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierNotIn(List<String> values) {
			addCriterion("modifier not in", values, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierBetween(String value1, String value2) {
			addCriterion("modifier between", value1, value2, "modifier");
			return (Criteria) this;
		}

		public Criteria andModifierNotBetween(String value1, String value2) {
			addCriterion("modifier not between", value1, value2, "modifier");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIsNull() {
			addCriterion("is_deleted is null");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIsNotNull() {
			addCriterion("is_deleted is not null");
			return (Criteria) this;
		}

		public Criteria andIsDeletedEqualTo(String value) {
			addCriterion("is_deleted =", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotEqualTo(String value) {
			addCriterion("is_deleted <>", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedGreaterThan(String value) {
			addCriterion("is_deleted >", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
			addCriterion("is_deleted >=", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedLessThan(String value) {
			addCriterion("is_deleted <", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedLessThanOrEqualTo(String value) {
			addCriterion("is_deleted <=", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedLike(String value) {
			addCriterion("is_deleted like", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotLike(String value) {
			addCriterion("is_deleted not like", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIn(List<String> values) {
			addCriterion("is_deleted in", values, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotIn(List<String> values) {
			addCriterion("is_deleted not in", values, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedBetween(String value1, String value2) {
			addCriterion("is_deleted between", value1, value2, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotBetween(String value1, String value2) {
			addCriterion("is_deleted not between", value1, value2, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andMobileNumIsNull() {
			addCriterion("mobile_num is null");
			return (Criteria) this;
		}

		public Criteria andMobileNumIsNotNull() {
			addCriterion("mobile_num is not null");
			return (Criteria) this;
		}

		public Criteria andMobileNumEqualTo(String value) {
			addCriterion("mobile_num =", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumNotEqualTo(String value) {
			addCriterion("mobile_num <>", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumGreaterThan(String value) {
			addCriterion("mobile_num >", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumGreaterThanOrEqualTo(String value) {
			addCriterion("mobile_num >=", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumLessThan(String value) {
			addCriterion("mobile_num <", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumLessThanOrEqualTo(String value) {
			addCriterion("mobile_num <=", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumLike(String value) {
			addCriterion("mobile_num like", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumNotLike(String value) {
			addCriterion("mobile_num not like", value, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumIn(List<String> values) {
			addCriterion("mobile_num in", values, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumNotIn(List<String> values) {
			addCriterion("mobile_num not in", values, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumBetween(String value1, String value2) {
			addCriterion("mobile_num between", value1, value2, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andMobileNumNotBetween(String value1, String value2) {
			addCriterion("mobile_num not between", value1, value2, "mobileNum");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andIdCardIsNull() {
			addCriterion("id_card is null");
			return (Criteria) this;
		}

		public Criteria andIdCardIsNotNull() {
			addCriterion("id_card is not null");
			return (Criteria) this;
		}

		public Criteria andIdCardEqualTo(String value) {
			addCriterion("id_card =", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotEqualTo(String value) {
			addCriterion("id_card <>", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardGreaterThan(String value) {
			addCriterion("id_card >", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardGreaterThanOrEqualTo(String value) {
			addCriterion("id_card >=", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLessThan(String value) {
			addCriterion("id_card <", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLessThanOrEqualTo(String value) {
			addCriterion("id_card <=", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLike(String value) {
			addCriterion("id_card like", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotLike(String value) {
			addCriterion("id_card not like", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardIn(List<String> values) {
			addCriterion("id_card in", values, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotIn(List<String> values) {
			addCriterion("id_card not in", values, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardBetween(String value1, String value2) {
			addCriterion("id_card between", value1, value2, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotBetween(String value1, String value2) {
			addCriterion("id_card not between", value1, value2, "idCard");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNull() {
			addCriterion("birth_day is null");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNotNull() {
			addCriterion("birth_day is not null");
			return (Criteria) this;
		}

		public Criteria andBirthDayEqualTo(Date value) {
			addCriterion("birth_day =", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotEqualTo(Date value) {
			addCriterion("birth_day <>", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThan(Date value) {
			addCriterion("birth_day >", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThanOrEqualTo(Date value) {
			addCriterion("birth_day >=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThan(Date value) {
			addCriterion("birth_day <", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThanOrEqualTo(Date value) {
			addCriterion("birth_day <=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayIn(List<Date> values) {
			addCriterion("birth_day in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotIn(List<Date> values) {
			addCriterion("birth_day not in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayBetween(Date value1, Date value2) {
			addCriterion("birth_day between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotBetween(Date value1, Date value2) {
			addCriterion("birth_day not between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andLoginIdIsNull() {
			addCriterion("login_id is null");
			return (Criteria) this;
		}

		public Criteria andLoginIdIsNotNull() {
			addCriterion("login_id is not null");
			return (Criteria) this;
		}

		public Criteria andLoginIdEqualTo(String value) {
			addCriterion("login_id =", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotEqualTo(String value) {
			addCriterion("login_id <>", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThan(String value) {
			addCriterion("login_id >", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
			addCriterion("login_id >=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThan(String value) {
			addCriterion("login_id <", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThanOrEqualTo(String value) {
			addCriterion("login_id <=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLike(String value) {
			addCriterion("login_id like", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotLike(String value) {
			addCriterion("login_id not like", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdIn(List<String> values) {
			addCriterion("login_id in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotIn(List<String> values) {
			addCriterion("login_id not in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdBetween(String value1, String value2) {
			addCriterion("login_id between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotBetween(String value1, String value2) {
			addCriterion("login_id not between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlIsNull() {
			addCriterion("photo_url is null");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlIsNotNull() {
			addCriterion("photo_url is not null");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlEqualTo(String value) {
			addCriterion("photo_url =", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlNotEqualTo(String value) {
			addCriterion("photo_url <>", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlGreaterThan(String value) {
			addCriterion("photo_url >", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
			addCriterion("photo_url >=", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlLessThan(String value) {
			addCriterion("photo_url <", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
			addCriterion("photo_url <=", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlLike(String value) {
			addCriterion("photo_url like", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlNotLike(String value) {
			addCriterion("photo_url not like", value, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlIn(List<String> values) {
			addCriterion("photo_url in", values, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlNotIn(List<String> values) {
			addCriterion("photo_url not in", values, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlBetween(String value1, String value2) {
			addCriterion("photo_url between", value1, value2, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andPhotoUrlNotBetween(String value1, String value2) {
			addCriterion("photo_url not between", value1, value2, "photoUrl");
			return (Criteria) this;
		}

		public Criteria andOrgIdIsNull() {
			addCriterion("org_id is null");
			return (Criteria) this;
		}

		public Criteria andOrgIdIsNotNull() {
			addCriterion("org_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrgIdEqualTo(String value) {
			addCriterion("org_id =", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotEqualTo(String value) {
			addCriterion("org_id <>", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThan(String value) {
			addCriterion("org_id >", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
			addCriterion("org_id >=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThan(String value) {
			addCriterion("org_id <", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThanOrEqualTo(String value) {
			addCriterion("org_id <=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLike(String value) {
			addCriterion("org_id like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotLike(String value) {
			addCriterion("org_id not like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdIn(List<String> values) {
			addCriterion("org_id in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotIn(List<String> values) {
			addCriterion("org_id not in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdBetween(String value1, String value2) {
			addCriterion("org_id between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotBetween(String value1, String value2) {
			addCriterion("org_id not between", value1, value2, "orgId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
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

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
     * This class corresponds to the database table emp_user
     *
     * @mbg.generated do_not_delete_during_merge Sat May 06 15:30:37 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}