package com.example.elmboot.entity;

import java.util.ArrayList;
import java.util.List;

public class SetmealdetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SetmealdetailedExample() {
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

        public Criteria andSdidIsNull() {
            addCriterion("sdId is null");
            return (Criteria) this;
        }

        public Criteria andSdidIsNotNull() {
            addCriterion("sdId is not null");
            return (Criteria) this;
        }

        public Criteria andSdidEqualTo(Integer value) {
            addCriterion("sdId =", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotEqualTo(Integer value) {
            addCriterion("sdId <>", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThan(Integer value) {
            addCriterion("sdId >", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdId >=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThan(Integer value) {
            addCriterion("sdId <", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThanOrEqualTo(Integer value) {
            addCriterion("sdId <=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidIn(List<Integer> values) {
            addCriterion("sdId in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotIn(List<Integer> values) {
            addCriterion("sdId not in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidBetween(Integer value1, Integer value2) {
            addCriterion("sdId between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sdId not between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSmidIsNull() {
            addCriterion("smId is null");
            return (Criteria) this;
        }

        public Criteria andSmidIsNotNull() {
            addCriterion("smId is not null");
            return (Criteria) this;
        }

        public Criteria andSmidEqualTo(Integer value) {
            addCriterion("smId =", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotEqualTo(Integer value) {
            addCriterion("smId <>", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThan(Integer value) {
            addCriterion("smId >", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smId >=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThan(Integer value) {
            addCriterion("smId <", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThanOrEqualTo(Integer value) {
            addCriterion("smId <=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidIn(List<Integer> values) {
            addCriterion("smId in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotIn(List<Integer> values) {
            addCriterion("smId not in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidBetween(Integer value1, Integer value2) {
            addCriterion("smId between", value1, value2, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("smId not between", value1, value2, "smid");
            return (Criteria) this;
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