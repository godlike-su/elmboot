package com.example.elmboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value="体检报告检查项信息表", description="体检报告检查项信息表")
@Data
public class Cireport implements Serializable {
    @ApiModelProperty(value = "检查项报告主键")
    private Integer cirld;

    @ApiModelProperty(value = "检查项编号")
    private Integer cild;

    @ApiModelProperty(value = "检查项名称")
    private String ciname;

    @ApiModelProperty(value = "所属预约编号 ")
    private Integer orderld;

    private static final long serialVersionUID = 1L;

    public Integer getCirld() {
        return cirld;
    }

    public void setCirld(Integer cirld) {
        this.cirld = cirld;
    }

    public Integer getCild() {
        return cild;
    }

    public void setCild(Integer cild) {
        this.cild = cild;
    }

    public String getCiname() {
        return ciname;
    }

    public void setCiname(String ciname) {
        this.ciname = ciname;
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
        sb.append(", cirld=").append(cirld);
        sb.append(", cild=").append(cild);
        sb.append(", ciname=").append(ciname);
        sb.append(", orderld=").append(orderld);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}