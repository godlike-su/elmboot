package com.example.elmboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


@ApiModel(value="体检报告检查项明细表", description="体检报告检查项明细表")
public class Cidetailedreport implements Serializable {
    @ApiModelProperty(value = "检查项明细报告编号")
    private Integer cidrid;

    @ApiModelProperty(value = "检查项明细名称")
    private String name;

    @ApiModelProperty(value = "检查项明细单位")
    private String unit;

    @ApiModelProperty(value = "检查项细明正常值范围中的最小值")
    private Double minrange;

    @ApiModelProperty(value = "检查项细明正常值范围中的最大值")
    private Double maxrange;

    @ApiModelProperty(value = "检查项明细正常值(非数字型 )")
    private String normalvalue;

    @ApiModelProperty(value = "检查项验证范围说明文字")
    private String normalvaluestring;

    @ApiModelProperty(value = "检查项明细类型(1:数值范围验证型，2:数值相等验证型;3:无需验证型;4:描述型 ;5:其它)")
    private Integer type;

    @ApiModelProperty(value = "检查项目明细值")
    private String value;

    @ApiModelProperty(value = "此项是否异常(0: 无异常 ;1: 异常 )")
    private Integer iserror;

    @ApiModelProperty(value = "所属检查项报告编号")
    private Integer cild;

    @ApiModelProperty(value = "所属预约编号  ")
    private Integer orderld;

    private static final long serialVersionUID = 1L;

    public Integer getCidrid() {
        return cidrid;
    }

    public void setCidrid(Integer cidrid) {
        this.cidrid = cidrid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getMinrange() {
        return minrange;
    }

    public void setMinrange(Double minrange) {
        this.minrange = minrange;
    }

    public Double getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(Double maxrange) {
        this.maxrange = maxrange;
    }

    public String getNormalvalue() {
        return normalvalue;
    }

    public void setNormalvalue(String normalvalue) {
        this.normalvalue = normalvalue;
    }

    public String getNormalvaluestring() {
        return normalvaluestring;
    }

    public void setNormalvaluestring(String normalvaluestring) {
        this.normalvaluestring = normalvaluestring;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIserror() {
        return iserror;
    }

    public void setIserror(Integer iserror) {
        this.iserror = iserror;
    }

    public Integer getCild() {
        return cild;
    }

    public void setCild(Integer cild) {
        this.cild = cild;
    }

    public Integer getOrderld() {
        return orderld;
    }

    public void setOrderld(Integer orderld) {
        this.orderld = orderld;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cidrid=").append(cidrid);
        sb.append(", name=").append(name);
        sb.append(", unit=").append(unit);
        sb.append(", minrange=").append(minrange);
        sb.append(", maxrange=").append(maxrange);
        sb.append(", normalvalue=").append(normalvalue);
        sb.append(", normalvaluestring=").append(normalvaluestring);
        sb.append(", type=").append(type);
        sb.append(", value=").append(value);
        sb.append(", iserror=").append(iserror);
        sb.append(", cild=").append(cild);
        sb.append(", orderld=").append(orderld);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}