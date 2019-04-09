package com.pzhu.management.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOcodeIsNull() {
            addCriterion("ocode is null");
            return (Criteria) this;
        }

        public Criteria andOcodeIsNotNull() {
            addCriterion("ocode is not null");
            return (Criteria) this;
        }

        public Criteria andOcodeEqualTo(String value) {
            addCriterion("ocode =", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotEqualTo(String value) {
            addCriterion("ocode <>", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeGreaterThan(String value) {
            addCriterion("ocode >", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ocode >=", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLessThan(String value) {
            addCriterion("ocode <", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLessThanOrEqualTo(String value) {
            addCriterion("ocode <=", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeLike(String value) {
            addCriterion("ocode like", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotLike(String value) {
            addCriterion("ocode not like", value, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeIn(List<String> values) {
            addCriterion("ocode in", values, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotIn(List<String> values) {
            addCriterion("ocode not in", values, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeBetween(String value1, String value2) {
            addCriterion("ocode between", value1, value2, "ocode");
            return (Criteria) this;
        }

        public Criteria andOcodeNotBetween(String value1, String value2) {
            addCriterion("ocode not between", value1, value2, "ocode");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberIsNull() {
            addCriterion("merchandisenumber is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberIsNotNull() {
            addCriterion("merchandisenumber is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberEqualTo(String value) {
            addCriterion("merchandisenumber =", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberNotEqualTo(String value) {
            addCriterion("merchandisenumber <>", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberGreaterThan(String value) {
            addCriterion("merchandisenumber >", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberGreaterThanOrEqualTo(String value) {
            addCriterion("merchandisenumber >=", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberLessThan(String value) {
            addCriterion("merchandisenumber <", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberLessThanOrEqualTo(String value) {
            addCriterion("merchandisenumber <=", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberLike(String value) {
            addCriterion("merchandisenumber like", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberNotLike(String value) {
            addCriterion("merchandisenumber not like", value, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberIn(List<String> values) {
            addCriterion("merchandisenumber in", values, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberNotIn(List<String> values) {
            addCriterion("merchandisenumber not in", values, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberBetween(String value1, String value2) {
            addCriterion("merchandisenumber between", value1, value2, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andMerchandisenumberNotBetween(String value1, String value2) {
            addCriterion("merchandisenumber not between", value1, value2, "merchandisenumber");
            return (Criteria) this;
        }

        public Criteria andOrderdataIsNull() {
            addCriterion("orderdata is null");
            return (Criteria) this;
        }

        public Criteria andOrderdataIsNotNull() {
            addCriterion("orderdata is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdataEqualTo(String value) {
            addCriterion("orderdata =", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotEqualTo(String value) {
            addCriterion("orderdata <>", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataGreaterThan(String value) {
            addCriterion("orderdata >", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataGreaterThanOrEqualTo(String value) {
            addCriterion("orderdata >=", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataLessThan(String value) {
            addCriterion("orderdata <", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataLessThanOrEqualTo(String value) {
            addCriterion("orderdata <=", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataLike(String value) {
            addCriterion("orderdata like", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotLike(String value) {
            addCriterion("orderdata not like", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataIn(List<String> values) {
            addCriterion("orderdata in", values, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotIn(List<String> values) {
            addCriterion("orderdata not in", values, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataBetween(String value1, String value2) {
            addCriterion("orderdata between", value1, value2, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotBetween(String value1, String value2) {
            addCriterion("orderdata not between", value1, value2, "orderdata");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNull() {
            addCriterion("merchandiseid is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNotNull() {
            addCriterion("merchandiseid is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidEqualTo(Integer value) {
            addCriterion("merchandiseid =", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotEqualTo(Integer value) {
            addCriterion("merchandiseid <>", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThan(Integer value) {
            addCriterion("merchandiseid >", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchandiseid >=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThan(Integer value) {
            addCriterion("merchandiseid <", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThanOrEqualTo(Integer value) {
            addCriterion("merchandiseid <=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIn(List<Integer> values) {
            addCriterion("merchandiseid in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotIn(List<Integer> values) {
            addCriterion("merchandiseid not in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidBetween(Integer value1, Integer value2) {
            addCriterion("merchandiseid between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotBetween(Integer value1, Integer value2) {
            addCriterion("merchandiseid not between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeid is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("employeeid =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("employeeid <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("employeeid >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeid >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("employeeid <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("employeeid <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("employeeid in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("employeeid not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("employeeid between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeid not between", value1, value2, "employeeid");
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