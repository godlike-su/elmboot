package com.example.elmboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value="检查项明细表", description="检查项明细表")
@Data
public class Checkitemdetailed implements Serializable {
    @ApiModelProperty(value = "检查项明细编号")
    private Integer cdid;

    @ApiModelProperty(value = "检查项明细名称")
    private String ciname;

    @ApiModelProperty(value = "检查项明细单位")
    private String unit;

    @ApiModelProperty(value = "检查项明细正常值范围中的最小值  ")
    private Double minrange;

    @ApiModelProperty(value = "检查项明细正常值范围中的最大值  ")
    private Double maxrange;

    @ApiModelProperty(value = "检查项明细正常值(非数字型 )  ")
    private String normalvalue;

    @ApiModelProperty(value = "检查项验证范围说明文字  ")
    private String normalvaluestring;

    @ApiModelProperty(value = "检查项明细类型(1:数值范围验证型，2:数值相等验证型 :3: 无需验证型:4: 描述型:5:其它)  ")
    private Integer type;

    @ApiModelProperty(value = "所属检查项编号  ")
    private Integer cild;

    @ApiModelProperty(value = "备注")
    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public String getCiname() {
        return ciname;
    }

    public void setCiname(String ciname) {
        this.ciname = ciname;
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

    public Integer getCild() {
        return cild;
    }

    public void setCild(Integer cild) {
        this.cild = cild;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cdid=").append(cdid);
        sb.append(", ciname=").append(ciname);
        sb.append(", unit=").append(unit);
        sb.append(", minrange=").append(minrange);
        sb.append(", maxrange=").append(maxrange);
        sb.append(", normalvalue=").append(normalvalue);
        sb.append(", normalvaluestring=").append(normalvaluestring);
        sb.append(", type=").append(type);
        sb.append(", cild=").append(cild);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}