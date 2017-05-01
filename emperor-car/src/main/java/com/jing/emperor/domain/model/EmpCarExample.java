package com.jing.emperor.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpCarExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public EmpCarExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
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

		public Criteria andCarNoIsNull() {
			addCriterion("car_no is null");
			return (Criteria) this;
		}

		public Criteria andCarNoIsNotNull() {
			addCriterion("car_no is not null");
			return (Criteria) this;
		}

		public Criteria andCarNoEqualTo(String value) {
			addCriterion("car_no =", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoNotEqualTo(String value) {
			addCriterion("car_no <>", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoGreaterThan(String value) {
			addCriterion("car_no >", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoGreaterThanOrEqualTo(String value) {
			addCriterion("car_no >=", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoLessThan(String value) {
			addCriterion("car_no <", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoLessThanOrEqualTo(String value) {
			addCriterion("car_no <=", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoLike(String value) {
			addCriterion("car_no like", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoNotLike(String value) {
			addCriterion("car_no not like", value, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoIn(List<String> values) {
			addCriterion("car_no in", values, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoNotIn(List<String> values) {
			addCriterion("car_no not in", values, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoBetween(String value1, String value2) {
			addCriterion("car_no between", value1, value2, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarNoNotBetween(String value1, String value2) {
			addCriterion("car_no not between", value1, value2, "carNo");
			return (Criteria) this;
		}

		public Criteria andCarBrandIsNull() {
			addCriterion("car_brand is null");
			return (Criteria) this;
		}

		public Criteria andCarBrandIsNotNull() {
			addCriterion("car_brand is not null");
			return (Criteria) this;
		}

		public Criteria andCarBrandEqualTo(String value) {
			addCriterion("car_brand =", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandNotEqualTo(String value) {
			addCriterion("car_brand <>", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandGreaterThan(String value) {
			addCriterion("car_brand >", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
			addCriterion("car_brand >=", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandLessThan(String value) {
			addCriterion("car_brand <", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandLessThanOrEqualTo(String value) {
			addCriterion("car_brand <=", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandLike(String value) {
			addCriterion("car_brand like", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandNotLike(String value) {
			addCriterion("car_brand not like", value, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandIn(List<String> values) {
			addCriterion("car_brand in", values, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandNotIn(List<String> values) {
			addCriterion("car_brand not in", values, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandBetween(String value1, String value2) {
			addCriterion("car_brand between", value1, value2, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarBrandNotBetween(String value1, String value2) {
			addCriterion("car_brand not between", value1, value2, "carBrand");
			return (Criteria) this;
		}

		public Criteria andCarSeatsIsNull() {
			addCriterion("car_seats is null");
			return (Criteria) this;
		}

		public Criteria andCarSeatsIsNotNull() {
			addCriterion("car_seats is not null");
			return (Criteria) this;
		}

		public Criteria andCarSeatsEqualTo(Integer value) {
			addCriterion("car_seats =", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsNotEqualTo(Integer value) {
			addCriterion("car_seats <>", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsGreaterThan(Integer value) {
			addCriterion("car_seats >", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsGreaterThanOrEqualTo(Integer value) {
			addCriterion("car_seats >=", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsLessThan(Integer value) {
			addCriterion("car_seats <", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsLessThanOrEqualTo(Integer value) {
			addCriterion("car_seats <=", value, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsIn(List<Integer> values) {
			addCriterion("car_seats in", values, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsNotIn(List<Integer> values) {
			addCriterion("car_seats not in", values, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsBetween(Integer value1, Integer value2) {
			addCriterion("car_seats between", value1, value2, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarSeatsNotBetween(Integer value1, Integer value2) {
			addCriterion("car_seats not between", value1, value2, "carSeats");
			return (Criteria) this;
		}

		public Criteria andCarTypeIsNull() {
			addCriterion("car_type is null");
			return (Criteria) this;
		}

		public Criteria andCarTypeIsNotNull() {
			addCriterion("car_type is not null");
			return (Criteria) this;
		}

		public Criteria andCarTypeEqualTo(String value) {
			addCriterion("car_type =", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeNotEqualTo(String value) {
			addCriterion("car_type <>", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeGreaterThan(String value) {
			addCriterion("car_type >", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
			addCriterion("car_type >=", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeLessThan(String value) {
			addCriterion("car_type <", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeLessThanOrEqualTo(String value) {
			addCriterion("car_type <=", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeLike(String value) {
			addCriterion("car_type like", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeNotLike(String value) {
			addCriterion("car_type not like", value, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeIn(List<String> values) {
			addCriterion("car_type in", values, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeNotIn(List<String> values) {
			addCriterion("car_type not in", values, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeBetween(String value1, String value2) {
			addCriterion("car_type between", value1, value2, "carType");
			return (Criteria) this;
		}

		public Criteria andCarTypeNotBetween(String value1, String value2) {
			addCriterion("car_type not between", value1, value2, "carType");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoIsNull() {
			addCriterion("car_insurance_info is null");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoIsNotNull() {
			addCriterion("car_insurance_info is not null");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoEqualTo(String value) {
			addCriterion("car_insurance_info =", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoNotEqualTo(String value) {
			addCriterion("car_insurance_info <>", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoGreaterThan(String value) {
			addCriterion("car_insurance_info >", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoGreaterThanOrEqualTo(String value) {
			addCriterion("car_insurance_info >=", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoLessThan(String value) {
			addCriterion("car_insurance_info <", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoLessThanOrEqualTo(String value) {
			addCriterion("car_insurance_info <=", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoLike(String value) {
			addCriterion("car_insurance_info like", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoNotLike(String value) {
			addCriterion("car_insurance_info not like", value, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoIn(List<String> values) {
			addCriterion("car_insurance_info in", values, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoNotIn(List<String> values) {
			addCriterion("car_insurance_info not in", values, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoBetween(String value1, String value2) {
			addCriterion("car_insurance_info between", value1, value2, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarInsuranceInfoNotBetween(String value1, String value2) {
			addCriterion("car_insurance_info not between", value1, value2, "carInsuranceInfo");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateIsNull() {
			addCriterion("car_buy_date is null");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateIsNotNull() {
			addCriterion("car_buy_date is not null");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateEqualTo(Date value) {
			addCriterion("car_buy_date =", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateNotEqualTo(Date value) {
			addCriterion("car_buy_date <>", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateGreaterThan(Date value) {
			addCriterion("car_buy_date >", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateGreaterThanOrEqualTo(Date value) {
			addCriterion("car_buy_date >=", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateLessThan(Date value) {
			addCriterion("car_buy_date <", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateLessThanOrEqualTo(Date value) {
			addCriterion("car_buy_date <=", value, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateIn(List<Date> values) {
			addCriterion("car_buy_date in", values, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateNotIn(List<Date> values) {
			addCriterion("car_buy_date not in", values, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateBetween(Date value1, Date value2) {
			addCriterion("car_buy_date between", value1, value2, "carBuyDate");
			return (Criteria) this;
		}

		public Criteria andCarBuyDateNotBetween(Date value1, Date value2) {
			addCriterion("car_buy_date not between", value1, value2, "carBuyDate");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
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
     * This class corresponds to the database table emp_car
     *
     * @mbg.generated do_not_delete_during_merge Mon May 01 10:57:30 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}