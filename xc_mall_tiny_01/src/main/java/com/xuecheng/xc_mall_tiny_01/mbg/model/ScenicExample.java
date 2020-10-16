package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andScenicIdIsNull() {
            addCriterion("Scenic_Id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("Scenic_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(String value) {
            addCriterion("Scenic_Id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(String value) {
            addCriterion("Scenic_Id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(String value) {
            addCriterion("Scenic_Id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(String value) {
            addCriterion("Scenic_Id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLike(String value) {
            addCriterion("Scenic_Id like", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotLike(String value) {
            addCriterion("Scenic_Id not like", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<String> values) {
            addCriterion("Scenic_Id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<String> values) {
            addCriterion("Scenic_Id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(String value1, String value2) {
            addCriterion("Scenic_Id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(String value1, String value2) {
            addCriterion("Scenic_Id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNull() {
            addCriterion("Scenic_Name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("Scenic_Name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("Scenic_Name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("Scenic_Name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("Scenic_Name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("Scenic_Name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("Scenic_Name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("Scenic_Name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("Scenic_Name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("Scenic_Name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("Scenic_Name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("Scenic_Name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNumIsNull() {
            addCriterion("Scenic_Num is null");
            return (Criteria) this;
        }

        public Criteria andScenicNumIsNotNull() {
            addCriterion("Scenic_Num is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNumEqualTo(Integer value) {
            addCriterion("Scenic_Num =", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumNotEqualTo(Integer value) {
            addCriterion("Scenic_Num <>", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumGreaterThan(Integer value) {
            addCriterion("Scenic_Num >", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Num >=", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumLessThan(Integer value) {
            addCriterion("Scenic_Num <", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumLessThanOrEqualTo(Integer value) {
            addCriterion("Scenic_Num <=", value, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumIn(List<Integer> values) {
            addCriterion("Scenic_Num in", values, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumNotIn(List<Integer> values) {
            addCriterion("Scenic_Num not in", values, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Num between", value1, value2, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Scenic_Num not between", value1, value2, "scenicNum");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIsNull() {
            addCriterion("Scenic_Location is null");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIsNotNull() {
            addCriterion("Scenic_Location is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLocationEqualTo(String value) {
            addCriterion("Scenic_Location =", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotEqualTo(String value) {
            addCriterion("Scenic_Location <>", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationGreaterThan(String value) {
            addCriterion("Scenic_Location >", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Scenic_Location >=", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLessThan(String value) {
            addCriterion("Scenic_Location <", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLessThanOrEqualTo(String value) {
            addCriterion("Scenic_Location <=", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLike(String value) {
            addCriterion("Scenic_Location like", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotLike(String value) {
            addCriterion("Scenic_Location not like", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIn(List<String> values) {
            addCriterion("Scenic_Location in", values, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotIn(List<String> values) {
            addCriterion("Scenic_Location not in", values, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationBetween(String value1, String value2) {
            addCriterion("Scenic_Location between", value1, value2, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotBetween(String value1, String value2) {
            addCriterion("Scenic_Location not between", value1, value2, "scenicLocation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}