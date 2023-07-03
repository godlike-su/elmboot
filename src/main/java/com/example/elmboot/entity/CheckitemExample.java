package com.example.elmboot.entity;

import java.util.ArrayList;
import java.util.List;

public class CheckitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckitemExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andCildIsNull() {
            addCriterion("cild is null");
            return (Criteria) this;
        }

        public Criteria andCildIsNotNull() {
            addCriterion("cild is not null");
            return (Criteria) this;
        }

        public Criteria andCildEqualTo(Integer value) {
            addCriterion("cild =", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildNotEqualTo(Integer value) {
            addCriterion("cild <>", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildGreaterThan(Integer value) {
            addCriterion("cild >", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildGreaterThanOrEqualTo(Integer value) {
            addCriterion("cild >=", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildLessThan(Integer value) {
            addCriterion("cild <", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildLessThanOrEqualTo(Integer value) {
            addCriterion("cild <=", value, "cild");
            return (Criteria) this;
        }

        public Criteria andCildIn(List<Integer> values) {
            addCriterion("cild in", values, "cild");
            return (Criteria) this;
        }

        public Criteria andCildNotIn(List<Integer> values) {
            addCriterion("cild not in", values, "cild");
            return (Criteria) this;
        }

        public Criteria andCildBetween(Integer value1, Integer value2) {
            addCriterion("cild between", value1, value2, "cild");
            return (Criteria) this;
        }

        public Criteria andCildNotBetween(Integer value1, Integer value2) {
            addCriterion("cild not between", value1, value2, "cild");
            return (Criteria) this;
        }

        public Criteria andCinameIsNull() {
            addCriterion("ciName is null");
            return (Criteria) this;
        }

        public Criteria andCinameIsNotNull() {
            addCriterion("ciName is not null");
            return (Criteria) this;
        }

        public Criteria andCinameEqualTo(String value) {
            addCriterion("ciName =", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameNotEqualTo(String value) {
            addCriterion("ciName <>", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameGreaterThan(String value) {
            addCriterion("ciName >", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameGreaterThanOrEqualTo(String value) {
            addCriterion("ciName >=", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameLessThan(String value) {
            addCriterion("ciName <", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameLessThanOrEqualTo(String value) {
            addCriterion("ciName <=", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameLike(String value) {
            addCriterion("ciName like", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameNotLike(String value) {
            addCriterion("ciName not like", value, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameIn(List<String> values) {
            addCriterion("ciName in", values, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameNotIn(List<String> values) {
            addCriterion("ciName not in", values, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameBetween(String value1, String value2) {
            addCriterion("ciName between", value1, value2, "ciname");
            return (Criteria) this;
        }

        public Criteria andCinameNotBetween(String value1, String value2) {
            addCriterion("ciName not between", value1, value2, "ciname");
            return (Criteria) this;
        }

        public Criteria andCicontentIsNull() {
            addCriterion("ciContent is null");
            return (Criteria) this;
        }

        public Criteria andCicontentIsNotNull() {
            addCriterion("ciContent is not null");
            return (Criteria) this;
        }

        public Criteria andCicontentEqualTo(String value) {
            addCriterion("ciContent =", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentNotEqualTo(String value) {
            addCriterion("ciContent <>", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentGreaterThan(String value) {
            addCriterion("ciContent >", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentGreaterThanOrEqualTo(String value) {
            addCriterion("ciContent >=", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentLessThan(String value) {
            addCriterion("ciContent <", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentLessThanOrEqualTo(String value) {
            addCriterion("ciContent <=", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentLike(String value) {
            addCriterion("ciContent like", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentNotLike(String value) {
            addCriterion("ciContent not like", value, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentIn(List<String> values) {
            addCriterion("ciContent in", values, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentNotIn(List<String> values) {
            addCriterion("ciContent not in", values, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentBetween(String value1, String value2) {
            addCriterion("ciContent between", value1, value2, "cicontent");
            return (Criteria) this;
        }

        public Criteria andCicontentNotBetween(String value1, String value2) {
            addCriterion("ciContent not between", value1, value2, "cicontent");
            return (Criteria) this;
        }

        public Criteria andMeaningIsNull() {
            addCriterion("meaning is null");
            return (Criteria) this;
        }

        public Criteria andMeaningIsNotNull() {
            addCriterion("meaning is not null");
            return (Criteria) this;
        }

        public Criteria andMeaningEqualTo(String value) {
            addCriterion("meaning =", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotEqualTo(String value) {
            addCriterion("meaning <>", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningGreaterThan(String value) {
            addCriterion("meaning >", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningGreaterThanOrEqualTo(String value) {
            addCriterion("meaning >=", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLessThan(String value) {
            addCriterion("meaning <", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLessThanOrEqualTo(String value) {
            addCriterion("meaning <=", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLike(String value) {
            addCriterion("meaning like", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotLike(String value) {
            addCriterion("meaning not like", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningIn(List<String> values) {
            addCriterion("meaning in", values, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotIn(List<String> values) {
            addCriterion("meaning not in", values, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningBetween(String value1, String value2) {
            addCriterion("meaning between", value1, value2, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotBetween(String value1, String value2) {
            addCriterion("meaning not between", value1, value2, "meaning");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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