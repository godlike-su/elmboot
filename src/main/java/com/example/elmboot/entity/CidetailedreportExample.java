package com.example.elmboot.entity;

import java.util.ArrayList;
import java.util.List;

public class CidetailedreportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CidetailedreportExample() {
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

        public Criteria andCidridIsNull() {
            addCriterion("cidrId is null");
            return (Criteria) this;
        }

        public Criteria andCidridIsNotNull() {
            addCriterion("cidrId is not null");
            return (Criteria) this;
        }

        public Criteria andCidridEqualTo(Integer value) {
            addCriterion("cidrId =", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridNotEqualTo(Integer value) {
            addCriterion("cidrId <>", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridGreaterThan(Integer value) {
            addCriterion("cidrId >", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridGreaterThanOrEqualTo(Integer value) {
            addCriterion("cidrId >=", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridLessThan(Integer value) {
            addCriterion("cidrId <", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridLessThanOrEqualTo(Integer value) {
            addCriterion("cidrId <=", value, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridIn(List<Integer> values) {
            addCriterion("cidrId in", values, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridNotIn(List<Integer> values) {
            addCriterion("cidrId not in", values, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridBetween(Integer value1, Integer value2) {
            addCriterion("cidrId between", value1, value2, "cidrid");
            return (Criteria) this;
        }

        public Criteria andCidridNotBetween(Integer value1, Integer value2) {
            addCriterion("cidrId not between", value1, value2, "cidrid");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMinrangeIsNull() {
            addCriterion("minrange is null");
            return (Criteria) this;
        }

        public Criteria andMinrangeIsNotNull() {
            addCriterion("minrange is not null");
            return (Criteria) this;
        }

        public Criteria andMinrangeEqualTo(Double value) {
            addCriterion("minrange =", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeNotEqualTo(Double value) {
            addCriterion("minrange <>", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeGreaterThan(Double value) {
            addCriterion("minrange >", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeGreaterThanOrEqualTo(Double value) {
            addCriterion("minrange >=", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeLessThan(Double value) {
            addCriterion("minrange <", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeLessThanOrEqualTo(Double value) {
            addCriterion("minrange <=", value, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeIn(List<Double> values) {
            addCriterion("minrange in", values, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeNotIn(List<Double> values) {
            addCriterion("minrange not in", values, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeBetween(Double value1, Double value2) {
            addCriterion("minrange between", value1, value2, "minrange");
            return (Criteria) this;
        }

        public Criteria andMinrangeNotBetween(Double value1, Double value2) {
            addCriterion("minrange not between", value1, value2, "minrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIsNull() {
            addCriterion("maxrange is null");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIsNotNull() {
            addCriterion("maxrange is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrangeEqualTo(Double value) {
            addCriterion("maxrange =", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotEqualTo(Double value) {
            addCriterion("maxrange <>", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeGreaterThan(Double value) {
            addCriterion("maxrange >", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeGreaterThanOrEqualTo(Double value) {
            addCriterion("maxrange >=", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeLessThan(Double value) {
            addCriterion("maxrange <", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeLessThanOrEqualTo(Double value) {
            addCriterion("maxrange <=", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIn(List<Double> values) {
            addCriterion("maxrange in", values, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotIn(List<Double> values) {
            addCriterion("maxrange not in", values, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeBetween(Double value1, Double value2) {
            addCriterion("maxrange between", value1, value2, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotBetween(Double value1, Double value2) {
            addCriterion("maxrange not between", value1, value2, "maxrange");
            return (Criteria) this;
        }

        public Criteria andNormalvalueIsNull() {
            addCriterion("normalValue is null");
            return (Criteria) this;
        }

        public Criteria andNormalvalueIsNotNull() {
            addCriterion("normalValue is not null");
            return (Criteria) this;
        }

        public Criteria andNormalvalueEqualTo(String value) {
            addCriterion("normalValue =", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueNotEqualTo(String value) {
            addCriterion("normalValue <>", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueGreaterThan(String value) {
            addCriterion("normalValue >", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueGreaterThanOrEqualTo(String value) {
            addCriterion("normalValue >=", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueLessThan(String value) {
            addCriterion("normalValue <", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueLessThanOrEqualTo(String value) {
            addCriterion("normalValue <=", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueLike(String value) {
            addCriterion("normalValue like", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueNotLike(String value) {
            addCriterion("normalValue not like", value, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueIn(List<String> values) {
            addCriterion("normalValue in", values, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueNotIn(List<String> values) {
            addCriterion("normalValue not in", values, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueBetween(String value1, String value2) {
            addCriterion("normalValue between", value1, value2, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvalueNotBetween(String value1, String value2) {
            addCriterion("normalValue not between", value1, value2, "normalvalue");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringIsNull() {
            addCriterion("normalValueString is null");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringIsNotNull() {
            addCriterion("normalValueString is not null");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringEqualTo(String value) {
            addCriterion("normalValueString =", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringNotEqualTo(String value) {
            addCriterion("normalValueString <>", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringGreaterThan(String value) {
            addCriterion("normalValueString >", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringGreaterThanOrEqualTo(String value) {
            addCriterion("normalValueString >=", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringLessThan(String value) {
            addCriterion("normalValueString <", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringLessThanOrEqualTo(String value) {
            addCriterion("normalValueString <=", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringLike(String value) {
            addCriterion("normalValueString like", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringNotLike(String value) {
            addCriterion("normalValueString not like", value, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringIn(List<String> values) {
            addCriterion("normalValueString in", values, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringNotIn(List<String> values) {
            addCriterion("normalValueString not in", values, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringBetween(String value1, String value2) {
            addCriterion("normalValueString between", value1, value2, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andNormalvaluestringNotBetween(String value1, String value2) {
            addCriterion("normalValueString not between", value1, value2, "normalvaluestring");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andIserrorIsNull() {
            addCriterion("isError is null");
            return (Criteria) this;
        }

        public Criteria andIserrorIsNotNull() {
            addCriterion("isError is not null");
            return (Criteria) this;
        }

        public Criteria andIserrorEqualTo(Integer value) {
            addCriterion("isError =", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorNotEqualTo(Integer value) {
            addCriterion("isError <>", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorGreaterThan(Integer value) {
            addCriterion("isError >", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorGreaterThanOrEqualTo(Integer value) {
            addCriterion("isError >=", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorLessThan(Integer value) {
            addCriterion("isError <", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorLessThanOrEqualTo(Integer value) {
            addCriterion("isError <=", value, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorIn(List<Integer> values) {
            addCriterion("isError in", values, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorNotIn(List<Integer> values) {
            addCriterion("isError not in", values, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorBetween(Integer value1, Integer value2) {
            addCriterion("isError between", value1, value2, "iserror");
            return (Criteria) this;
        }

        public Criteria andIserrorNotBetween(Integer value1, Integer value2) {
            addCriterion("isError not between", value1, value2, "iserror");
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

        public Criteria andOrderldIsNull() {
            addCriterion("orderld is null");
            return (Criteria) this;
        }

        public Criteria andOrderldIsNotNull() {
            addCriterion("orderld is not null");
            return (Criteria) this;
        }

        public Criteria andOrderldEqualTo(Integer value) {
            addCriterion("orderld =", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldNotEqualTo(Integer value) {
            addCriterion("orderld <>", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldGreaterThan(Integer value) {
            addCriterion("orderld >", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderld >=", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldLessThan(Integer value) {
            addCriterion("orderld <", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldLessThanOrEqualTo(Integer value) {
            addCriterion("orderld <=", value, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldIn(List<Integer> values) {
            addCriterion("orderld in", values, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldNotIn(List<Integer> values) {
            addCriterion("orderld not in", values, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldBetween(Integer value1, Integer value2) {
            addCriterion("orderld between", value1, value2, "orderld");
            return (Criteria) this;
        }

        public Criteria andOrderldNotBetween(Integer value1, Integer value2) {
            addCriterion("orderld not between", value1, value2, "orderld");
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