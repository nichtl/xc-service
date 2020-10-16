package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScenicUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGraduationIsNull() {
            addCriterion("Graduation is null");
            return (Criteria) this;
        }

        public Criteria andGraduationIsNotNull() {
            addCriterion("Graduation is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationEqualTo(String value) {
            addCriterion("Graduation =", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotEqualTo(String value) {
            addCriterion("Graduation <>", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationGreaterThan(String value) {
            addCriterion("Graduation >", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationGreaterThanOrEqualTo(String value) {
            addCriterion("Graduation >=", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationLessThan(String value) {
            addCriterion("Graduation <", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationLessThanOrEqualTo(String value) {
            addCriterion("Graduation <=", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationLike(String value) {
            addCriterion("Graduation like", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotLike(String value) {
            addCriterion("Graduation not like", value, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationIn(List<String> values) {
            addCriterion("Graduation in", values, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotIn(List<String> values) {
            addCriterion("Graduation not in", values, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationBetween(String value1, String value2) {
            addCriterion("Graduation between", value1, value2, "graduation");
            return (Criteria) this;
        }

        public Criteria andGraduationNotBetween(String value1, String value2) {
            addCriterion("Graduation not between", value1, value2, "graduation");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("Authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("Authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(Byte value) {
            addCriterion("Authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(Byte value) {
            addCriterion("Authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(Byte value) {
            addCriterion("Authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("Authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(Byte value) {
            addCriterion("Authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(Byte value) {
            addCriterion("Authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<Byte> values) {
            addCriterion("Authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<Byte> values) {
            addCriterion("Authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(Byte value1, Byte value2) {
            addCriterion("Authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(Byte value1, Byte value2) {
            addCriterion("Authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LoginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LoginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("ImageURL is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("ImageURL is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("ImageURL =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("ImageURL <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("ImageURL >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("ImageURL >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("ImageURL <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("ImageURL <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("ImageURL like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("ImageURL not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("ImageURL in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("ImageURL not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("ImageURL between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("ImageURL not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("Count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("Count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(String value) {
            addCriterion("Count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(String value) {
            addCriterion("Count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(String value) {
            addCriterion("Count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(String value) {
            addCriterion("Count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(String value) {
            addCriterion("Count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(String value) {
            addCriterion("Count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLike(String value) {
            addCriterion("Count like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotLike(String value) {
            addCriterion("Count not like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<String> values) {
            addCriterion("Count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<String> values) {
            addCriterion("Count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(String value1, String value2) {
            addCriterion("Count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(String value1, String value2) {
            addCriterion("Count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusIsNull() {
            addCriterion("IsOnLineStatus is null");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusIsNotNull() {
            addCriterion("IsOnLineStatus is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusEqualTo(String value) {
            addCriterion("IsOnLineStatus =", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusNotEqualTo(String value) {
            addCriterion("IsOnLineStatus <>", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusGreaterThan(String value) {
            addCriterion("IsOnLineStatus >", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusGreaterThanOrEqualTo(String value) {
            addCriterion("IsOnLineStatus >=", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusLessThan(String value) {
            addCriterion("IsOnLineStatus <", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusLessThanOrEqualTo(String value) {
            addCriterion("IsOnLineStatus <=", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusLike(String value) {
            addCriterion("IsOnLineStatus like", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusNotLike(String value) {
            addCriterion("IsOnLineStatus not like", value, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusIn(List<String> values) {
            addCriterion("IsOnLineStatus in", values, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusNotIn(List<String> values) {
            addCriterion("IsOnLineStatus not in", values, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusBetween(String value1, String value2) {
            addCriterion("IsOnLineStatus between", value1, value2, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andIsonlinestatusNotBetween(String value1, String value2) {
            addCriterion("IsOnLineStatus not between", value1, value2, "isonlinestatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIslogoffIsNull() {
            addCriterion("IsLogOff is null");
            return (Criteria) this;
        }

        public Criteria andIslogoffIsNotNull() {
            addCriterion("IsLogOff is not null");
            return (Criteria) this;
        }

        public Criteria andIslogoffEqualTo(String value) {
            addCriterion("IsLogOff =", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffNotEqualTo(String value) {
            addCriterion("IsLogOff <>", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffGreaterThan(String value) {
            addCriterion("IsLogOff >", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffGreaterThanOrEqualTo(String value) {
            addCriterion("IsLogOff >=", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffLessThan(String value) {
            addCriterion("IsLogOff <", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffLessThanOrEqualTo(String value) {
            addCriterion("IsLogOff <=", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffLike(String value) {
            addCriterion("IsLogOff like", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffNotLike(String value) {
            addCriterion("IsLogOff not like", value, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffIn(List<String> values) {
            addCriterion("IsLogOff in", values, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffNotIn(List<String> values) {
            addCriterion("IsLogOff not in", values, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffBetween(String value1, String value2) {
            addCriterion("IsLogOff between", value1, value2, "islogoff");
            return (Criteria) this;
        }

        public Criteria andIslogoffNotBetween(String value1, String value2) {
            addCriterion("IsLogOff not between", value1, value2, "islogoff");
            return (Criteria) this;
        }

        public Criteria andRegistrydateIsNull() {
            addCriterion("RegistryDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrydateIsNotNull() {
            addCriterion("RegistryDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrydateEqualTo(Date value) {
            addCriterionForJDBCDate("RegistryDate =", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RegistryDate <>", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateGreaterThan(Date value) {
            addCriterionForJDBCDate("RegistryDate >", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RegistryDate >=", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateLessThan(Date value) {
            addCriterionForJDBCDate("RegistryDate <", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RegistryDate <=", value, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateIn(List<Date> values) {
            addCriterionForJDBCDate("RegistryDate in", values, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RegistryDate not in", values, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RegistryDate between", value1, value2, "registrydate");
            return (Criteria) this;
        }

        public Criteria andRegistrydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RegistryDate not between", value1, value2, "registrydate");
            return (Criteria) this;
        }

        public Criteria andIdentitynumIsNull() {
            addCriterion("IdentityNum is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumIsNotNull() {
            addCriterion("IdentityNum is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumEqualTo(String value) {
            addCriterion("IdentityNum =", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumNotEqualTo(String value) {
            addCriterion("IdentityNum <>", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumGreaterThan(String value) {
            addCriterion("IdentityNum >", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityNum >=", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumLessThan(String value) {
            addCriterion("IdentityNum <", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumLessThanOrEqualTo(String value) {
            addCriterion("IdentityNum <=", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumLike(String value) {
            addCriterion("IdentityNum like", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumNotLike(String value) {
            addCriterion("IdentityNum not like", value, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumIn(List<String> values) {
            addCriterion("IdentityNum in", values, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumNotIn(List<String> values) {
            addCriterion("IdentityNum not in", values, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumBetween(String value1, String value2) {
            addCriterion("IdentityNum between", value1, value2, "identitynum");
            return (Criteria) this;
        }

        public Criteria andIdentitynumNotBetween(String value1, String value2) {
            addCriterion("IdentityNum not between", value1, value2, "identitynum");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("UserType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("UserType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("UserType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("UserType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("UserType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("UserType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("UserType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("UserType like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("UserType not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("UserType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("UserType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("UserType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("UserType not between", value1, value2, "usertype");
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